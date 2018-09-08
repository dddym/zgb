package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.entity.Temp;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.TempService;
import cn.zgbfour.zgb.utils.CosUtls;
import cn.zgbfour.zgb.utils.ResultUtil;
import cn.zgbfour.zgb.utils.UserInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @Autowired
    private CosUtls cosUtls;

    @RequestMapping(value = Message.TEST)
    public Result<List<Temp>> test(@RequestParam(value = "file") MultipartFile file){
        //System.out.println(UserInfoUtils.getUserInfo());
        //return ResultUtil.success("项目第一步");
        cosUtls.uploadImg(file);
        return tempService.getTemp();
    }
}
