package cn.zgbfour.zgb.vo;

import cn.zgbfour.zgb.config.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * author:liuda
 * Date:2018/9/6
 * Time:23:50
 * 用户信息 bean，作用域：request
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserInfoRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //redis存放用户信息的key
    private String tokenKey;

    public LoginVo getUserInfo(){
        String s = stringRedisTemplate.boundValueOps(tokenKey).get();
        return JSON.parseObject(s,LoginVo.class);
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }
}
