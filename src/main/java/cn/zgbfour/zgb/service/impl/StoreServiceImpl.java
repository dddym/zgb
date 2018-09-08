package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.dao.StoreMapper;
import cn.zgbfour.zgb.entity.Store;
import cn.zgbfour.zgb.entity.StoreExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.StoreService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:34
 */
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreMapper storeMapper;

    @Override
    public Result insertStore(Store store) {
        try{
            //审核状态默认为2，即未审核
            store.setReviewStatus(Message.NOTREVIEW);
            if(store.getLicense()!=null){
                storeMapper.insertSelective(store);
               /* if (ReviewAgent(store)){
                    return ResultUtil.success();
                }else{
                    if (store.getReviewStatus()==1){
                        return ResultUtil.error(ResultMsg.REVIEW_NOTPASS_CODE,ResultMsg.REVIEW_NOTPASS_MSG);
                    }else if(store.getReviewStatus()==2){
                        return ResultUtil.error(ResultMsg.NOT_REVIEW_CODE,ResultMsg.NOT_REVIEW_MSG);
                    }
                }*/
                return ResultUtil.success();
            }
            return ResultUtil.error(ResultMsg.REVIEW_NOTINPUT_CODE,ResultMsg.REVIEW_NOTINPUT_MSG);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_INSERT_CODE,ResultMsg.CATEGORY_INSERT_MSG);
        }
    }

    @Override
    public Result<List<Store>> selectAllStore(int areaId) {
        try{
            StoreExample storeExample = new StoreExample();
            StoreExample.Criteria criteria = storeExample.createCriteria();
            criteria.andAreaIdEqualTo(areaId);
            List<Store> stores = storeMapper.selectByExample(storeExample);
            return ResultUtil.success(stores);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }

    }

    @Override
    public Result updateStoreById(Store store) {
        try{
            //审核通过0,审核不通过1
            storeMapper.updateByPrimaryKey(store);
            return ResultUtil.success();
        }catch (Exception e){
            return  ResultUtil.error(ResultMsg.CATEGORY_UPDATE_CODE,ResultMsg.CATEGORY_UPDATE_MSG);
        }
    }

 /*   @Override
    public boolean ReviewAgent(Store store) {
        Result<Store> storeResult = selectStoreInformation(store.getId());
        if (storeResult.getData().getReviewStatus()==Message.NOTREVIEW){
            //人工审核，将商店的信息传入后台管理系统进行审核，通过返回true

            updateStoreById(store);
        }
        return storeResult.getData().getReviewStatus()==Message.REVIEWPASS?true:false;
    }*/


   @Override
    public Result<Store> selectStoreInformation(int id) {
        try{
            Store store = storeMapper.selectByPrimaryKey(id);
            return ResultUtil.success(store);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }
    }
}
