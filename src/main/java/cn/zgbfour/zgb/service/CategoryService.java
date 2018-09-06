package cn.zgbfour.zgb.service;

import cn.zgbfour.zgb.entity.Category;
import cn.zgbfour.zgb.model.Result;

import java.util.List;

public interface CategoryService {
    public Result insert(Category category);

    public Result<List<Category>> selectAllByAgentId(int agent_id);

    public Result deleteByAgentIdAndCategoryId(int categoryId);

    public Result updateByCategoryId(Category category);
}
