package com.dcits.base.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dcits.base.mapper.MyMapper;
import com.dcits.base.pojo.User;
import com.dcits.base.service.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices userServices;
	@Autowired
	private MyMapper myMapper;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Boolean login(String name, String password, HttpSession session) {
		User user = userServices.login(name, password);
		HashMap<String, Object> role = myMapper.getRole(user.getSid());
		List<HashMap<String, String>> menus = myMapper.getMenus((Integer)role.get("sid"));
		session.setAttribute("user", user);
		session.setAttribute("role", role.get("role_name"));
		session.setAttribute("menus", menus);
		return user != null;
	}
	
	@RequestMapping(value = "/addUser")
	public String add(User user) {
		return "{\"result\" : \"" + userServices.addUser(user) + "\"}";
	}
	
	@RequestMapping(value = "/aboutMe")
	public User aboutMe(HttpSession session) {
		User user = (User)session.getAttribute("user");
		if(user == null) {
			return new User();
		}
		user.setPassword("");
		return user;
	}
	
	@RequestMapping(value = "/delUser")
	public String del(String sid) {
		return "{\"result\" : \"" + userServices.delUser(sid) + "\"}";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		return "{\"result\" : \"" + userServices.updateUser(user) + "\"}";		
	}
	
	@RequestMapping("/updatePwd")
	public String updateUser(String sid, String oldPwd, String newPwd) {
		return "{\"result\" : \"" + userServices.updateUserPwd(sid, oldPwd, newPwd) + "\"}";		
	}
	
	@RequestMapping("/queryAUser")
	public User queryAUser(String sid) {
		User user = userServices.selectAUser(sid);
		if(user != null) user.setPassword(null);
		return user;
	}
	
	@RequestMapping("/queryUsers")
	public HashMap<String, List<User>> queryUsers(){
		HashMap<String, List<User>> map = new HashMap<>(); 
		map.put("users", userServices.selectAllActiveUser());
		return map;
	}
}



