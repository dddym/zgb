package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.dao.ProductMapper;
import cn.zgbfour.zgb.entity.Product;
import cn.zgbfour.zgb.entity.ProductExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.ProductService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zhw
 * @Date:2018/9/7 0:26
 */
@Service
public class ProduceServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Result insertProduct(Product product) {
         productMapper.insertSelective(product);
         return ResultUtil.success();
    }

    @Override
    public Result<List<Product>> selectAllProductByCategory(Integer categoryId, Integer agentId) {
        try{
            ProductExample productExample = new ProductExample();
            ProductExample.Criteria criteria = productExample.createCriteria();
            criteria.andCategoryIdEqualTo(categoryId);
            criteria.andAgentIdEqualTo(agentId);
            List<Product> products = productMapper.selectByExample(productExample);
            return ResultUtil.success(products);
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }

    }

    @Override
    public Result deleteProductByProduct(int id) {
        productMapper.deleteByPrimaryKey(id);
        return ResultUtil.success();
    }

    @Override
    public Result updateProductByKey(Product product) {
        productMapper.updateByPrimaryKey(product);
        return ResultUtil.success();
    }
}
