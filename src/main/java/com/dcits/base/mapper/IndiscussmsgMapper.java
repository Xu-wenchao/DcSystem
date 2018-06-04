package com.dcits.base.mapper;

import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.IndiscussmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndiscussmsgMapper {
    int countByExample(IndiscussmsgExample example);

    int deleteByExample(IndiscussmsgExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Indiscussmsg record);

    int insertSelective(Indiscussmsg record);

    List<Indiscussmsg> selectByExample(IndiscussmsgExample example);

    Indiscussmsg selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Indiscussmsg record, @Param("example") IndiscussmsgExample example);

    int updateByExample(@Param("record") Indiscussmsg record, @Param("example") IndiscussmsgExample example);

    int updateByPrimaryKeySelective(Indiscussmsg record);

    int updateByPrimaryKey(Indiscussmsg record);
}