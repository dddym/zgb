package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.LoginService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:liuda
 * Date:2018/9/5
 * Time:0:17
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login")
    public Result login(String username,String passsword,String areaId){
        if (StringUtils.isBlank(username) || StringUtils.isBlank(passsword)
                || StringUtils.isBlank(areaId)){
            return ResultUtil.error(ResultMsg.LOGIN_NOTMSG_CODE,ResultMsg.LOGIN_NOTMSG_MSG);
        }else {
            return loginService.login(username,passsword,Integer.parseInt(areaId));
        }
    }
}
