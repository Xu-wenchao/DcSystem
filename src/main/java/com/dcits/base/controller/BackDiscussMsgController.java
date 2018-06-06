package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Backdiscussmsg;
import com.dcits.base.pojo.User;
import com.dcits.base.service.BackDiscussMsgServices;

@RestController
public class BackDiscussMsgController {
	@Autowired
	private BackDiscussMsgServices services;
	
	@RequestMapping("/addBackMsg")
	public String addBackMsg(Backdiscussmsg msg, HttpSession session) {
		User user = (User) session.getAttribute("user");
		msg.setUserSid(user.getSid());
		return "{\"result\" : \"" + services.addBackMsg(msg) + "\"}";
	}
	
	@RequestMapping("/alterBackMsg")
	public String alterBackMsg(Backdiscussmsg record, HttpSession session) {
		record.setUserSid(((User)session.getAttribute("user")).getSid());
		return "{\"result\" : \"" + services.alterBackMsgBySid(record) + "\"}";		
	}
	
	@RequestMapping("/getBackMsgs")
	public HashMap<String, List<Backdiscussmsg>> getBackMsgs(Integer userSid, HttpSession session){
		HashMap<String, List<Backdiscussmsg>> map = new HashMap<>();
		map.put("backMsgs", services.getBackMsgsByUserSid(((User)session.getAttribute("user")).getSid()));
		return map;
	}
}
