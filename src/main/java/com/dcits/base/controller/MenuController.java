package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Menu;
import com.dcits.base.pojo.Role;
import com.dcits.base.service.MenuServices;
import com.dcits.base.service.RoleServices;

@RestController
public class MenuController {

	@Autowired
	private MenuServices menuServices;
	
	@RequestMapping("/getAllMenus")
	public HashMap<String, List<Menu>> getMenus(){
		return new HashMap<String, List<Menu>>() {{
			put("menus", menuServices.getAllMenus());
		}};
	}

	@RequestMapping("/addMenu")
	public String addMenu(Menu menu) {
		return "{ \"result\" : " + menuServices.addMenu(menu) + " }";
	}
	
}
