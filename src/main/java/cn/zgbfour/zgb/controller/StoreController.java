package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.entity.Store;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.StoreService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:28
 */

@RestController
@RequestMapping(Message.API)
public class StoreController {
    @Autowired
    private StoreService storeService;
    /**
     * 商户注册：商户注册时，上传营业执照，审核通过后设为0，默认为1.
     * @param store
     * @return
     */
    @RequestMapping("/store/insertStore")
    public Result InsertStore(Store store){
        if(store!=null){
               return storeService.insertStore(store);
        }else{
            return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
        }
    }


    @RequestMapping("/store/selectAllStore")
    public Result<List<Store>> SelectAllStore(String areaId){
        if(StringUtils.isNotBlank(areaId)){
            return  storeService.selectAllStore(Integer.parseInt(areaId));
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }

    //用于审核的接口
    @RequestMapping("/store/selectStoreById")
    public Result<Store> SelectStoreById(String id){
        if(StringUtils.isNotBlank(id)){
            return storeService.selectStoreInformation(Integer.parseInt(id));
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }
    //审核结果提交
    @RequestMapping("/store/updateStoreById")
    public Result UpdateStoreById(Store store){
        if(store!=null){
            return storeService.updateStoreById(store);
        }
      return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }
}
