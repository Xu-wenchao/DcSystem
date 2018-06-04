package com.dcits.base.mapper;

import com.dcits.base.pojo.Backdiscussmsg;
import com.dcits.base.pojo.BackdiscussmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackdiscussmsgMapper {
    int countByExample(BackdiscussmsgExample example);

    int deleteByExample(BackdiscussmsgExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Backdiscussmsg record);

    int insertSelective(Backdiscussmsg record);

    List<Backdiscussmsg> selectByExample(BackdiscussmsgExample example);

    Backdiscussmsg selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Backdiscussmsg record, @Param("example") BackdiscussmsgExample example);

    int updateByExample(@Param("record") Backdiscussmsg record, @Param("example") BackdiscussmsgExample example);

    int updateByPrimaryKeySelective(Backdiscussmsg record);

    int updateByPrimaryKey(Backdiscussmsg record);
}