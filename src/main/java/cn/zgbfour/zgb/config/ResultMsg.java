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

    public static final Integer NO_TOKEN_CODE = 10004;
    public static final String NO_TOKEN_MSG = "没有传入token信息";

    public static final Integer NO_VAL_TOKEN_CODE = 10005;
    public static final String NO_VAL_TOKEN_MSG = "token失效，请重新登陆";


    //分类错误信息和错误码
    //插入数据失败
    public static final Integer CATEGORY_INSERT_CODE = 20001;
    public static final String CATEGORY_INSERT_MSG = "插入失败";
    //代理商id为null
    public static final Integer CATEGORY_NO_AGENTID_CODE = 20002;
    public static final String CATEGORY_NO_AGENTID_MSG = "代理商id不能为空";
    //category对象为null
    public static final Integer CATEGORY_NULL_CODE = 20003;
    public static final String CATEGORY_NULL_MSG = "类别为空";
    //查询失败
    public static final Integer CATEGORY_SELECT_CODE = 20004;
    public static final String CATEGORY_SELECT_MSG = "查询失败";
    //删除失败
    public static final Integer CATEGORY_DELETE_CODE = 20006;
    public static final String CATEGORY_DELETE_MSG = "删除失败";
    //更新失败
    public static final Integer CATEGORY_UPDATE_CODE = 20007;
    public static final String CATEGORY_UPDATE_MSG = "更新失败";
    //参数为空
    public static final Integer PARAM_NULL_CODE=20005;
    public static final String PARAM_NULL_MSG="参数为空,请传入参数";
    //审核不通过
    public static final Integer REVIEW_NOTPASS_CODE=20006;
    public static final String REVIEW_NOTPASS_MSG="审核不通过";
    //未审核
    public static final Integer NOT_REVIEW_CODE=20008;
    public static final String NOT_REVIEW_MSG="暂未审核";
    //未上传营业执照
    public static final Integer REVIEW_NOTINPUT_CODE=20007;
    public static final String REVIEW_NOTINPUT_MSG="未上传营业执照";
}
