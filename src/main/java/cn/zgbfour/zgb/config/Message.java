package cn.zgbfour.zgb.config;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:22:40
 */
public class Message {
    //微信小程序ID
    public static String WX_APPID = "";

    //微信小程序sercret
    public static String WX_APPSECRET = "";

    //微信换取session_key请求路径
    public static String WX_SESSION_URL = "https://api.weixin.qq.com/sns/jscode2session";

    //微信支付的商户id
    public static final String mch_id = "";
    //微信支付的商户密钥
    public static final String key = "";
    //支付成功后的服务器回调url
    public static final String notify_url = "";
    //签名方式，固定值
    public static final String SIGNTYPE = "MD5";
    //交易类型，小程序支付的固定值为JSAPI
    public static final String TRADETYPE = "JSAPI";
    //微信统一下单接口地址
    public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    //访问前缀
    public static final String API = "/api";

    //测试的访问接口
    public static final String TEST = "hello";

    //用户类型 1商户创建者  2商户使用者 3代理商创建者 4配送员 5库房管理员  6代理商使用者  88区域管理员 99系统管理员

    public static final Integer STORY_CREATE = 1;
    public static final Integer STORY_USER = 2;
    public static final Integer AGENT_CREATE = 3;
    public static final Integer AGENT_DISTRIBUTE = 4;
    public static final Integer AGENT_STRATEGY = 5;
    public static final Integer AGENT_USER = 6;
    public static final Integer AREA_MANAGE = 88;
    public static final Integer ADMIN = 99;

    //redis中存放用户id的标识前缀
    public static final String CONTENT = "SYSTEM_USER";
}
