package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.IndiscussmsgMapper;
import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.IndiscussmsgExample;
import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.IndiscussmsgExample.Criteria;

@Service
public class InDiscussMsgServices {
	@Autowired
	private IndiscussmsgMapper inDiscussMsgMapper;
	
	public Indiscussmsg getInMsgBySid(int sid) {
		return inDiscussMsgMapper.selectByPrimaryKey(sid);
	}
	
	public List<Indiscussmsg> getInMsgsByUserSid(int userSid){
		IndiscussmsgExample example = new IndiscussmsgExample();
		Criteria createCriteria = example.createCriteria();
		if(userSid != 0) {
			createCriteria.andUserSidEqualTo(userSid);
		}
		return inDiscussMsgMapper.selectByExample(example);	
	}
	
	
	/*
	 * 谁创见的谁能改
	 */
	public int alterInMsgBySid(Indiscussmsg record) {
		IndiscussmsgExample example = new IndiscussmsgExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSidEqualTo(record.getSid());
		createCriteria.andUserSidEqualTo(record.getUserSid());
		return inDiscussMsgMapper.updateByExample(record, example);
	}
	
	public int addInMsg(Indiscussmsg msg) {
		return inDiscussMsgMapper.insert(msg);
	}
}
