package cn.zgbfour.zgb.dao;

import cn.zgbfour.zgb.entity.Distribute;
import cn.zgbfour.zgb.entity.DistributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributeMapper {
    long countByExample(DistributeExample example);

    int deleteByExample(DistributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Distribute record);

    int insertSelective(Distribute record);

    List<Distribute> selectByExample(DistributeExample example);

    Distribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Distribute record, @Param("example") DistributeExample example);

    int updateByExample(@Param("record") Distribute record, @Param("example") DistributeExample example);

    int updateByPrimaryKeySelective(Distribute record);

    int updateByPrimaryKey(Distribute record);

    Distribute selectForUpdate(Integer id);
}