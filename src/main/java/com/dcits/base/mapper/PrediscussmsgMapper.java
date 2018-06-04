package com.dcits.base.mapper;

import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.PrediscussmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrediscussmsgMapper {
    int countByExample(PrediscussmsgExample example);

    int deleteByExample(PrediscussmsgExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Prediscussmsg record);

    int insertSelective(Prediscussmsg record);

    List<Prediscussmsg> selectByExample(PrediscussmsgExample example);

    Prediscussmsg selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Prediscussmsg record, @Param("example") PrediscussmsgExample example);

    int updateByExample(@Param("record") Prediscussmsg record, @Param("example") PrediscussmsgExample example);

    int updateByPrimaryKeySelective(Prediscussmsg record);

    int updateByPrimaryKey(Prediscussmsg record);
}