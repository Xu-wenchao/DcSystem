package com.dcits.base.mapper;

import com.dcits.base.pojo.Menu;
import com.dcits.base.pojo.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}