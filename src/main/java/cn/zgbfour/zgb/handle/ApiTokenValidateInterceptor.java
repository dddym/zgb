package cn.zgbfour.zgb.handle;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.utils.ResultUtil;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * author:liuda
 * Date:2018/9/6
 * Time:1:14
 */
public class ApiTokenValidateInterceptor implements HandlerInterceptor {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        System.out.println("执行了拦截器");
        String authorization = request.getHeader("Authorization");
        String authorization1 = request.getParameter("Authorization");
        if (StringUtils.isBlank(authorization) && StringUtils.isBlank(authorization1)){
            //没有token
            Result error = ResultUtil.error(ResultMsg.NO_TOKEN_CODE, ResultMsg.NO_TOKEN_MSG);
            sendFailRes(error, response);
            return false;
        }
        String value =stringRedisTemplate.boundValueOps(StringUtils.isNotBlank(authorization)?authorization:authorization1).get();
        if (StringUtils.isNotBlank(value)){
            stringRedisTemplate.opsForValue().set(StringUtils.isNotBlank(authorization)?authorization:authorization1,
                    value, 60*30, TimeUnit.SECONDS);
            stringRedisTemplate.opsForValue().set(value,
                    stringRedisTemplate.boundValueOps(value).get(), 60*30, TimeUnit.SECONDS);
            return true;
        }else {
            Result error = ResultUtil.error(ResultMsg.NO_VAL_TOKEN_CODE, ResultMsg.NO_VAL_TOKEN_MSG);
            sendFailRes(error, response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
    private void sendFailRes(Result result, HttpServletResponse response) throws IOException {
        response.reset();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.setStatus(HttpStatus.SC_FORBIDDEN);
        response.getWriter().print(JSON.toJSONString(result));
    }
}
