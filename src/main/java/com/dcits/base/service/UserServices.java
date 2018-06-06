package com.dcits.base.service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.RoleMapper;
import com.dcits.base.mapper.UserMapper;
import com.dcits.base.mapper.UserRoleRefMapper;
import com.dcits.base.pojo.Role;
import com.dcits.base.pojo.User;
import com.dcits.base.pojo.UserExample;
import com.dcits.base.pojo.UserExample.Criteria;
import com.dcits.base.pojo.UserRoleRef;

@Service
public class UserServices {

	@Value("${defaultpwd}")
	private String defaultPwd;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserRoleRefMapper urrMapper;
	
	public User login(String userName, String password) {
		UserExample ue = new UserExample();
		Criteria criteria = ue.createCriteria();
		criteria.andItcodeEqualTo(userName);
		criteria.andPasswordEqualTo(DigestUtils.md5Hex(password));
		List<User> users = userMapper.selectByExample(ue);
		return users != null && users.size() > 0 ? users.get(0) : null;
	}
	
	public int addUser(User user, String roleId) {
		//这里应该加一个权限验证，拥有添加权限的用户才能添加
		user.setPassword(DigestUtils.md5Hex(defaultPwd));
		user.setOther("0");
		if(userMapper.insert(user) > 0) {
			UserRoleRef urr = new UserRoleRef();
			urr.setUserSid(user.getSid());
			urr.setRoleSid(Integer.parseInt(roleId));
			return urrMapper.insert(urr);
		}
		return 0;
	}
	
	public int updateUser(User user) {
		//不更新密码
		user.setPassword(null);
		return userMapper.updateByPrimaryKeySelective(user);
	}
	

	public int updateUserPwd(String sid, String oldPwd, String newPwd) {
		int id = Integer.parseInt(sid);
		User user = userMapper.selectByPrimaryKey(id);
		//只更新密码
		if(user == null || !user.getPassword().equals(DigestUtils.md5Hex(oldPwd))) {
			return 0;
		}else {
			user.setPassword(DigestUtils.md5Hex(newPwd));
			return userMapper.updateByPrimaryKey(user);
		}
	}
	
	public int delUser(String sid) {
		User user = new User();
		user.setSid(Integer.parseInt(sid));
		user.setOther("1");
		return userMapper.updateByPrimaryKeySelective(user);
	}
	
	public User selectAUser(String sid) {
		return userMapper.selectByPrimaryKey(Integer.parseInt(sid));
	}
	
	public List<User> selectAllActiveUser() {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andOtherNotEqualTo("1");
		
		return userMapper.selectByExample(example);
	}
}


