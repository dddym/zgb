package cn.zgbfour.zgb.controller;

import cn.zgbfour.zgb.config.Message;
import cn.zgbfour.zgb.config.ResultMsg;
import cn.zgbfour.zgb.entity.Category;
import cn.zgbfour.zgb.model.Result;
import cn.zgbfour.zgb.service.CategoryService;
import cn.zgbfour.zgb.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value =  Message.API)
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = "/category/insert")
    public Result InsertCategory(Category category){
        if (category!=null){
            return categoryService.insert(category);
        }else{
            return ResultUtil.error(ResultMsg.CATEGORY_NULL_CODE, ResultMsg.CATEGORY_NULL_MSG);
        }
    }
    @RequestMapping(value = "/category/selectAllByAgentId")
    public Result<List<Category>> SelectAllByAgentId(String agentId){
        if (agentId!=null){
            int agent_id=Integer.parseInt(agentId);
            return categoryService.selectAllByAgentId(agent_id);
        }else{
            return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
        }
    }
   @RequestMapping(value = "/category/deleteByAgentIdAndCategoryId")
    public Result DeleteByAgentIdAndCategoryId(String categoryId){
       if (StringUtils.isNotBlank(categoryId)){
           int category_id=Integer.parseInt(categoryId);
           return  categoryService.deleteByAgentIdAndCategoryId(category_id);
       }else{
           return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
       }
    }


    @RequestMapping(value="/category/updateByCategoryId")
    public Result UpdateByCategoryId(Category category){
        if(category!=null){
            categoryService.updateByCategoryId(category);
            return ResultUtil.success();
        }
        return ResultUtil.error(ResultMsg.PARAM_NULL_CODE,ResultMsg.PARAM_NULL_MSG);
    }

}
