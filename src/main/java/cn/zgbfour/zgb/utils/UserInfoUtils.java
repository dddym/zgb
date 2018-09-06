package cn.zgbfour.zgb.utils;

import cn.zgbfour.zgb.vo.LoginVo;
import cn.zgbfour.zgb.vo.UserInfoRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author:liuda
 * Date:2018/9/6
 * Time:23:35
 * 从redis中获取相应用户信息 工具类
 */
@Component
public class UserInfoUtils {

    private static UserInfoRedis userInfoRedis() {
        return SpringContextHolder.getBean(UserInfoRedis.class);
    }

    public static LoginVo getUserInfo(){
        return userInfoRedis().getUserInfo();
    }
}
