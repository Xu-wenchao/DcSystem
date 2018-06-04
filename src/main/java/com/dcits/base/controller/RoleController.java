package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Role;
import com.dcits.base.service.RoleServices;

@RestController
public class RoleController {

	@Autowired
	private RoleServices roleServices;
	
	@RequestMapping("/getAllRoles")
	public HashMap<String, List<Role>> getRoles(){
		return new HashMap<String, List<Role>>() {{
			put("roles", roleServices.getAllRoles());
		}};
	}
	
}
