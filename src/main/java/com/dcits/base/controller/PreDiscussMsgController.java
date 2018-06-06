package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.User;
import com.dcits.base.service.PreDiscussMsgServices;

@RestController
public class PreDiscussMsgController {
	@Autowired
	private PreDiscussMsgServices services;
	
	@RequestMapping("/addPreMsg")
	public String addPreMsg(Prediscussmsg msg, HttpSession session) {
		User user = (User) session.getAttribute("user");
		msg.setUserId(user.getSid());
		msg.setRemark("待分派");
		return "{\"result\" : \"" + services.addPreMsg(msg) + "\"}";
	}
	
	@RequestMapping("/alterPreMsg")
	public String alterPreMsg(Prediscussmsg record, HttpSession session) {
		record.setUserId(((User)session.getAttribute("user")).getSid());
		return "{\"result\" : \"" + services.alterPreMsgBySid(record) + "\"}";		
	}
	
	@RequestMapping("/getPreMsgs")
	public HashMap<String, List<Prediscussmsg>> getPreMsgs(Integer userSid, HttpSession session){
		HashMap<String, List<Prediscussmsg>> map = new HashMap<>();
		map.put("preMsgs", services.getPreMsgsByUserSid(((User)session.getAttribute("user")).getSid()));
		return map;
	}
	
	@RequestMapping("/getPreMsg")
	public Prediscussmsg getPreMsgs(Integer sid){
		return services.getPreMsgBySid(sid);
	}
}
