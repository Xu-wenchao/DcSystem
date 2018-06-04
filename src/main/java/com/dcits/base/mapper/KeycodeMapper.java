package com.dcits.base.mapper;

import com.dcits.base.pojo.Keycode;
import com.dcits.base.pojo.KeycodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeycodeMapper {
    int countByExample(KeycodeExample example);

    int deleteByExample(KeycodeExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Keycode record);

    int insertSelective(Keycode record);

    List<Keycode> selectByExample(KeycodeExample example);

    Keycode selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Keycode record, @Param("example") KeycodeExample example);

    int updateByExample(@Param("record") Keycode record, @Param("example") KeycodeExample example);

    int updateByPrimaryKeySelective(Keycode record);

    int updateByPrimaryKey(Keycode record);
}