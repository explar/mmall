package com.m.mapper;

import com.m.entity.MmallCart;
import com.m.entity.MmallCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmallCartMapper {
    int countByExample(MmallCartExample example);

    int deleteByExample(MmallCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MmallCart record);

    int insertSelective(MmallCart record);

    List<MmallCart> selectByExample(MmallCartExample example);

    MmallCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MmallCart record, @Param("example") MmallCartExample example);

    int updateByExample(@Param("record") MmallCart record, @Param("example") MmallCartExample example);

    int updateByPrimaryKeySelective(MmallCart record);

    int updateByPrimaryKey(MmallCart record);
}