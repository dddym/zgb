package cn.zgbfour.zgb.exception;

import cn.zgbfour.zgb.enums.ResultEnum;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:23:09
 */
public class GirlException extends  RuntimeException {
    //spring框架只会对RuntimeException进行事务回滚

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code =resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
