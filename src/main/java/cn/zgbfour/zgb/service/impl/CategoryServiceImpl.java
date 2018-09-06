package cn.zgbfour.zgb.service.impl;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.dao.CategoryMapper;
import cn.zgbfour.zgb.dao.ProductMapper;
import cn.zgbfour.zgb.entity.Category;
import cn.zgbfour.zgb.entity.CategoryExample;
import cn.zgbfour.zgb.entity.Product;
import cn.zgbfour.zgb.entity.ProductExample;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.CategoryService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Result insert(Category category) {
        try{
            if(category.getAgentId()==null){
                return ResultUtil.error(ResultMsg.CATEGORY_NO_AGENTID_CODE,ResultMsg.CATEGORY_NO_AGENTID_MSG);
            }
            if(category.getName()==null){
                return ResultUtil.error(ResultMsg.CATEGORY_NULL_CODE,ResultMsg.CATEGORY_NULL_MSG);
            }
            Date currentTime = new Date();
            category.setCreateTime(currentTime);
            category.setIsDelete(Message.STATUS_EXIST);
            categoryMapper.insertSelective(category);
            return ResultUtil.success();
        }catch (Exception e) {
            return ResultUtil.error(ResultMsg.CATEGORY_INSERT_CODE,ResultMsg.CATEGORY_INSERT_MSG);
        }
    }

    @Override
    public Result<List<Category>> selectAllByAgentId(int agent_id) {
        try {
            CategoryExample categoryExample = new CategoryExample();
            CategoryExample.Criteria criteria = categoryExample.createCriteria();
            criteria.andAgentIdEqualTo(agent_id);
            List<Category> categories = categoryMapper.selectByExample(categoryExample);
            return ResultUtil.success(categories);
        }catch (Exception e){
            return  ResultUtil.error(ResultMsg.CATEGORY_SELECT_CODE,ResultMsg.CATEGORY_SELECT_MSG);
        }
    }

    @Override
    public Result deleteByAgentIdAndCategoryId(int categoryId) {
        try{
            boolean flag=true;
            ProductExample productExample = new ProductExample();
            ProductExample.Criteria criteria1 = productExample.createCriteria();
            criteria1.andCategoryIdEqualTo(categoryId);
            List<Product> products = productMapper.selectByExample(productExample);
            if((products.isEmpty()||products==null)&&flag){
                CategoryExample categoryExample = new CategoryExample();
                CategoryExample.Criteria criteria = categoryExample.createCriteria();
                criteria.andCategoryIdEqualTo(categoryId);
                if(flag){
                    categoryMapper.deleteByExample(categoryExample);
                }
            }else{
                return ResultUtil.success(products);
            }
            return ResultUtil.success();
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_DELETE_CODE,ResultMsg.CATEGORY_DELETE_MSG);
        }
    }

    @Override
    public Result updateByCategoryId(Category category) {
        try{
            categoryMapper.updateByPrimaryKeySelective(category);
            return ResultUtil.success();
        }catch (Exception e){
            return ResultUtil.error(ResultMsg.CATEGORY_UPDATE_CODE,ResultMsg.CATEGORY_UPDATE_MSG);
        }

    }


}
