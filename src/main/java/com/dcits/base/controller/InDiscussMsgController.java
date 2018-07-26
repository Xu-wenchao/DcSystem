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
import com.dcits.base.service.UserServices;

@RestController
public class InDiscussMsgController {
	
	@Autowired
	private UserServices userServices;
	
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
		Indiscussmsg inMsg = services.getInMsgBySid(record.getSid());
		record.setUserSid(inMsg.getUserSid());
		record.setPdmSid(inMsg.getPdmSid());
		return "{\"result\" : \"" + services.alterInMsgBySid(record) + "\"}";		
	}
	
	@RequestMapping("/getInMsgs")
	public HashMap<String, Object> getInMsgs(Integer userSid, HttpSession session){
		HashMap<String, Object> map = new HashMap<>();
		map.put("powerMan", "0");

		//用session中的sid
		User user = ((User)session.getAttribute("user"));
		userSid = user.getSid();
		String roleName = (String)session.getAttribute("role");
		
		if(roleName.equals("系统管理员")) {
			userSid = 0;
			map.put("powerMan", "1");
			//map.put("users", userServices.selectAllActiveUser());
			map.put("inMsgs", services.getInMsgsByUserSid(userSid));			
		}else if(roleName.equals("专家")){
			map.put("inMsgs", services.getInMsgsByUserSid(userSid));			
		}else { //销售人员
			map.put("inMsgs", services.getInMsgsByUserSid(userSid));			
		}
		return map;
	}
	
	
	@RequestMapping("/getInMsg")
	public Indiscussmsg getInMsg(Integer sid){
		return services.getInMsgBySid(sid);
	}
	
	
}
