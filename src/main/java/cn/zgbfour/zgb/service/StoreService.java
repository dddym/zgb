package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.base.BaseMethod;
import cn.zgbfour.zgb.entity.Store;
import cn.zgbfour.zgb.model.Result;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/8 9:33
 */
public interface StoreService extends BaseMethod<Store> {
   public Result insertStore(Store store);

   public Result<List<Store>> selectAllStore(int areaId);

   public Result updateStoreById(Store store);

   public Result<Store> selectStoreInformation(int id);
}
