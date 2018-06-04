package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.RoleMapper;
import com.dcits.base.pojo.Role;
import com.dcits.base.pojo.RoleExample;

@Service
public class RoleServices {

	@Autowired
	private RoleMapper roleMapper;
	
	public List<Role> getAllRoles(){
		return roleMapper.selectByExample(new RoleExample());
	}
}
