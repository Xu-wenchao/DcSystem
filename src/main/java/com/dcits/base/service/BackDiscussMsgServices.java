package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.BackdiscussmsgMapper;
import com.dcits.base.pojo.Backdiscussmsg;
import com.dcits.base.pojo.BackdiscussmsgExample;
import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.BackdiscussmsgExample.Criteria;

@Service
public class BackDiscussMsgServices {
	@Autowired
	private BackdiscussmsgMapper backDiscussMsgMapper;
	
	public Backdiscussmsg getBackMsgBySid(int sid) {
		return backDiscussMsgMapper.selectByPrimaryKey(sid);
	}
	
	public List<Backdiscussmsg> getBackMsgsByUserSid(int userSid){
		BackdiscussmsgExample example = new BackdiscussmsgExample();
		Criteria createCriteria = example.createCriteria();
		if(userSid != 0) {
			createCriteria.andUserSidEqualTo(userSid);
		}
		return backDiscussMsgMapper.selectByExample(example);
	}
	
	
	/*
	 * 谁创见的谁能改
	 */
	public int alterBackMsgBySid(Backdiscussmsg record) {
		BackdiscussmsgExample example = new BackdiscussmsgExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSidEqualTo(record.getSid());
		createCriteria.andUserSidEqualTo(record.getUserSid());
		return backDiscussMsgMapper.updateByExample(record, example);
	}
	
	public int addBackMsg(Backdiscussmsg msg) {
		return backDiscussMsgMapper.insert(msg);
	}
}
