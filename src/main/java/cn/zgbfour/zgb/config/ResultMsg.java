package cn.zgbfour.zgb.config;

/**
 * author:liuda
 * Date:2018/9/5
 * Time:0:39
 */
public class ResultMsg {

    //状态码和错误信息

    //不存在用户
    public static final Integer LOGIN_NO_USER_CODE = 10001;
    public static final String LOGIN_NO_USER_MSG = "用户名或者密码错误";

    public static final Integer LOGIN_SELECT_USER_CODE = 10002;
    public static final String LOGIN_SELECT_USER_MSG = "服务器查询用户数据失败";

    public static final Integer LOGIN_NOTMSG_CODE = 10003;
    public static final String LOGIN_NOTMSG_MSG = "查询信息不全，请输入全部信息";

}
