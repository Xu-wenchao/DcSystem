package com.dcits.base.mapper;

import com.dcits.base.pojo.Rolepower;
import com.dcits.base.pojo.RolepowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolepowerMapper {
    int countByExample(RolepowerExample example);

    int deleteByExample(RolepowerExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Rolepower record);

    int insertSelective(Rolepower record);

    List<Rolepower> selectByExample(RolepowerExample example);

    Rolepower selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Rolepower record, @Param("example") RolepowerExample example);

    int updateByExample(@Param("record") Rolepower record, @Param("example") RolepowerExample example);

    int updateByPrimaryKeySelective(Rolepower record);

    int updateByPrimaryKey(Rolepower record);
}