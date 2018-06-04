
package com.dcits.base.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.dcits.base.pojo.Menu;
import com.dcits.base.pojo.Role;
import com.dcits.base.pojo.User;

public interface MyMapper {
	@Select("select role.sid, role.role_name from user, user_role_ref, role where user.sid=#{id} "
			+ "and user.sid=user_role_ref.user_sid and role.sid=user_role_ref.role_sid")
	HashMap<String, Object> getRole(Integer id);
	
	@Select("select menu.menu_name, menu.remark from role, rolepower, menu where role.sid=1 " 
			+ "and role.sid=rolepower.role_sid and rolepower.menu_sid=menu.sid")
	List<HashMap<String, String>> getMenus(Integer sid);
	
}
