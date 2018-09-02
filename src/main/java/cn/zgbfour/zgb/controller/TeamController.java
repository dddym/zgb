package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.entity.Temp;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.TempService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author:liuda
 * Date:2018/8/27
 * Time:22:38
 */
@RestController
@RequestMapping(value = Message.API)
public class TeamController {

    @Autowired
    private TempService tempService;

    @RequestMapping(value = Message.TEST)
    public Result<List<Temp>> test(){
        //return ResultUtil.success("项目第一步");
        return tempService.getTemp();
    }
}
