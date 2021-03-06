package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.entity.Product;
import cn.zgbfour.zgb.model.Result;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/7 0:25
 */
public interface ProductService {
   public  Result insertProduct(Product product);
   public  Result<List<Product>> selectAllProductByCategory(Integer categoryId, Integer agentId);
   public Result deleteProductByProduct(int id);
    public Result updateProductByKey(Product product);
}
