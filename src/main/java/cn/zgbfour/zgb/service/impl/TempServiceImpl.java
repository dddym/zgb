package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.dao.TempMapper;
import cn.zgbfour.zgb.entity.Temp;
import cn.zgbfour.zgb.entity.TempExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.TempService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:23:51
 */
@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempMapper tempMapper;

    @Override
    public Result<List<Temp>> getTemp() {
        try {
            TempExample tempExample = new TempExample();
            TempExample.Criteria criteria = tempExample.createCriteria();
            criteria.andIdNotEqualTo(0);
            List<Temp> temps = tempMapper.selectByExample(tempExample);
            return ResultUtil.success(temps);
        }catch (Exception e){
            return ResultUtil.error(1001,"测试不通过");
        }

    }
}
