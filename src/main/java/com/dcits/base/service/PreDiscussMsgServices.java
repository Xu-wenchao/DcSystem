package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.KeycodeMapper;
import com.dcits.base.mapper.PrediscussmsgMapper;
import com.dcits.base.pojo.Keycode;
import com.dcits.base.pojo.KeycodeExample;
import com.dcits.base.pojo.KeycodeExample.Criteria;
import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.PrediscussmsgExample;

@Service
public class PreDiscussMsgServices {

	@Autowired
	private PrediscussmsgMapper preDiscussMsgMapper;
	

	
	public List<Prediscussmsg> getPreMsgsByUserSid(int userSid){
		PrediscussmsgExample example = new PrediscussmsgExample();
		com.dcits.base.pojo.PrediscussmsgExample.Criteria createCriteria = example.createCriteria();
		if(userSid != 0) {
			createCriteria.andUserIdEqualTo(userSid);
		}
		return preDiscussMsgMapper.selectByExample(example);
	}
	
	
	/*
	 * 谁创见的谁能改
	 */
	public int alterPreMsgBySid(Prediscussmsg record) {
		PrediscussmsgExample example = new PrediscussmsgExample();
		com.dcits.base.pojo.PrediscussmsgExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andSidEqualTo(record.getSid());
		createCriteria.andUserIdEqualTo(record.getUserId());
		return preDiscussMsgMapper.updateByExample(record, example);
	}
	
	public int addPreMsg(Prediscussmsg msg) {
		return preDiscussMsgMapper.insert(msg);
	}
	
}
