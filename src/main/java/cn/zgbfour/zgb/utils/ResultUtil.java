package cn.zgbfour.zgb.utils;

import cn.zgbfour.zgb.model.Result;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:23:12
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return  success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
