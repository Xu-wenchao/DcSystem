package com.dcits.base.mapper;

import com.dcits.base.pojo.UserRoleRef;
import com.dcits.base.pojo.UserRoleRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRefMapper {
    int countByExample(UserRoleRefExample example);

    int deleteByExample(UserRoleRefExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    List<UserRoleRef> selectByExample(UserRoleRefExample example);

    UserRoleRef selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByExample(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByPrimaryKeySelective(UserRoleRef record);

    int updateByPrimaryKey(UserRoleRef record);
}