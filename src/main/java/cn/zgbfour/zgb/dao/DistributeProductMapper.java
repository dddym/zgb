package cn.zgbfour.zgb.dao;

import cn.zgbfour.zgb.entity.DistributeProduct;
import cn.zgbfour.zgb.entity.DistributeProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributeProductMapper {
    long countByExample(DistributeProductExample example);

    int deleteByExample(DistributeProductExample example);

    int insert(DistributeProduct record);

    int insertSelective(DistributeProduct record);

    List<DistributeProduct> selectByExample(DistributeProductExample example);

    int updateByExampleSelective(@Param("record") DistributeProduct record, @Param("example") DistributeProductExample example);

    int updateByExample(@Param("record") DistributeProduct record, @Param("example") DistributeProductExample example);
}