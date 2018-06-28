package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.Role;
import com.dcits.base.pojo.User;
import com.dcits.base.service.InDiscussMsgServices;
import com.dcits.base.service.PreDiscussMsgServices;
import com.dcits.base.service.UserServices;

@RestController
public class PreDiscussMsgController {
	@Autowired
	private PreDiscussMsgServices services;
	
	@Autowired
	private UserServices userServices;
	
	@Autowired
	private InDiscussMsgServices inDiscussMsgServices;
	
	@RequestMapping("/addPreMsg")
	public String addPreMsg(Prediscussmsg msg, HttpSession session) {
		User user = (User) session.getAttribute("user");
		msg.setUserId(user.getSid());
		msg.setRemark("待分派");
		return "{\"result\" : \"" + services.addPreMsg(msg) + "\"}";
	}
	
	@RequestMapping("/alterPreMsg")
	public String alterPreMsg(Prediscussmsg record, HttpSession session) {
		//只有创建人可以改
		record.setUserId(((User)session.getAttribute("user")).getSid());
		return "{\"result\" : \"" + services.alterPreMsgBySid(record) + "\"}";		
	}
	
	@RequestMapping("/alterPreMsgProfessional")
	public String alterPreMsgProfessional(Prediscussmsg record, HttpSession session) {
		return "{\"result\" : \"" + services.alterPreMsgProfessionalBySid(record) + "\"}";		
	}
	
	@RequestMapping("/getPreMsgs")
	public HashMap<String, Object> getPreMsgs(Integer userSid, HttpSession session){
		HashMap<String, Object> map = new HashMap<>();
		map.put("powerMan", "0");

		//用session中的sid
		User user = ((User)session.getAttribute("user"));
		userSid = user.getSid();
		String roleName = (String)session.getAttribute("role");
		
		if(roleName.equals("系统管理员")) {
			userSid = 0;
			map.put("powerMan", "1");
			map.put("users", userServices.selectAllActiveUser());
			map.put("preMsgs", services.getPreMsgsByUserSid(userSid));			
		}else if(roleName.equals("专家")){
			//map.put("preMsgs", services.getPreMsgBy(sid));
			List<Indiscussmsg> inMsgsByUserSid = inDiscussMsgServices.getInMsgsByUserSid(userSid);
			
		}else { //销售人员
			map.put("preMsgs", services.getPreMsgsByUserSid(userSid));			
		}
		return map;
	}
	
	@RequestMapping("/getPreMsg")
	public Prediscussmsg getPreMsgs(Integer sid){
		return services.getPreMsgBySid(sid);
	}
}
