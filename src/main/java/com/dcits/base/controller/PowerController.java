package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.mapper.MyMapper;

@RestController
public class PowerController {

	@Autowired
	private MyMapper myMapper;
	
	@RequestMapping("/getMenus")
	public HashMap<String, List<HashMap<String, String>>> getMenus(HttpSession session){
		HashMap<String, List<HashMap<String, String>>> map = new HashMap<>();
		map.put("menus", (List<HashMap<String, String>>)session.getAttribute("menus"));
		return map;
	}

	@RequestMapping("/getMenusPower")
	public HashMap<String, List<HashMap<String, Object>>> getMenus4Power(Integer menuSid){
		HashMap<String, List<HashMap<String, Object>>> map = new HashMap<>();
		map.put("menus", myMapper.getMenus4Power(menuSid));
		return map;
	}
	

	
}
