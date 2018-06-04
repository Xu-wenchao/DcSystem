package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerController {

	@RequestMapping("/getMenus")
	public HashMap<String, List<HashMap<String, String>>> getMenus(HttpSession session){
		HashMap<String, List<HashMap<String, String>>> map = new HashMap<>();
		map.put("menus", (List<HashMap<String, String>>)session.getAttribute("menus"));
		return map;
	}
}
