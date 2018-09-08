package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.entity.Category;
import cn.zgbfour.zgb.entity.Product;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.CategoryService;
import cn.zgbfour.zgb.service.ProductService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:zhw
 * @Date:2018/9/7 0:23
 */
@RestController
@RequestMapping(value = Message.API)
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/product/insert")
    public Result InsertProduct(Product product){
        return productService.insertProduct(product);
    }

    @RequestMapping(value = "/product/selectProductByCategory")
    public Result<Map<Category,List<Product>>> SelectAllProductByCategory(String agentId){
        if(StringUtils.isNotBlank(agentId)){
            Result<List<Category>> listResult = categoryService.selectAllByAgentId(Integer.parseInt(agentId));
            List<Category> Categories = listResult.getData();
            Map<Category, List<Product>> map = new HashMap<Category, List<Product>>();
            for (Category category:Categories) {
                Result<List<Product>> listResult1 = productService.selectAllProductByCategory(category.getAgentId(),category.getCategoryId());
                List<Product> data = listResult1.getData();
                map.put(category,data);
            }
            return ResultUtil.success(map);
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);

    }

    @RequestMapping(value = "/product/deleteProductByProduct")
    public Result DeleteProductByProduct(String id){
        return productService.deleteProductByProduct(Integer.parseInt(id));
    }

    @RequestMapping(value="/product/updateProductByKey")
    public Result UpdateProductByKey(Product product){
        return productService.updateProductByKey(product);
    }
}
