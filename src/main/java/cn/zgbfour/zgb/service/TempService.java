package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.entity.Temp;
import cn.zgbfour.zgb.model.Result;

import java.util.List;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:23:49
 */
public interface TempService {

    public Result<List<Temp>> getTemp();
}
