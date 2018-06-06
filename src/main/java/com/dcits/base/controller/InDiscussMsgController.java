package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.User;
import com.dcits.base.service.InDiscussMsgServices;

@RestController
public class InDiscussMsgController {
	@Autowired
	private InDiscussMsgServices services;
	
	@RequestMapping("/addInMsg")
	public String addInMsg(Indiscussmsg msg, HttpSession session) {
		User user = (User) session.getAttribute("user");
		msg.setUserSid(user.getSid());
		return "{\"result\" : \"" + services.addInMsg(msg) + "\"}";
	}
	
	@RequestMapping("/alterInMsg")
	public String alterInMsg(Indiscussmsg record, HttpSession session) {
		record.setUserSid(((User)session.getAttribute("user")).getSid());
		return "{\"result\" : \"" + services.alterInMsgBySid(record) + "\"}";		
	}
	
	@RequestMapping("/getInMsgs")
	public HashMap<String, List<Indiscussmsg>> getInMsgs(Integer userSid, HttpSession session){
		HashMap<String, List<Indiscussmsg>> map = new HashMap<>();
		map.put("inMsgs", services.getInMsgsByUserSid(((User)session.getAttribute("user")).getSid()));
		return map;
	}
}
