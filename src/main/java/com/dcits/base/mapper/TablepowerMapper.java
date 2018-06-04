package com.dcits.base.mapper;

import com.dcits.base.pojo.Tablepower;
import com.dcits.base.pojo.TablepowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablepowerMapper {
    int countByExample(TablepowerExample example);

    int deleteByExample(TablepowerExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Tablepower record);

    int insertSelective(Tablepower record);

    List<Tablepower> selectByExample(TablepowerExample example);

    Tablepower selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Tablepower record, @Param("example") TablepowerExample example);

    int updateByExample(@Param("record") Tablepower record, @Param("example") TablepowerExample example);

    int updateByPrimaryKeySelective(Tablepower record);

    int updateByPrimaryKey(Tablepower record);
}