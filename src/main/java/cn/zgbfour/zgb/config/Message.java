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

    public static final String TEST = "hello";


}
