package cn.zgbfour.zgb.handle;

import cn.zgbfour.zgb.exception.GirlException;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:23:07
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    //@ControllerAdvice 注解定义全局异常处理类  请确保此 ExceptionHandle 类能被扫描到并装载进 Spring 容器中。
    //@ExceptionHandler 注解声明异常处理方法
    // handle()方法就会处理所有 Controller 层抛出的 Exception 及其子类的异常，这是最基本的用法了。
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }else {
            logger.error("系统错误{}",e);
            return ResultUtil.error(-1,"未知错误");
        }


    }
}