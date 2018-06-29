package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcits.base.mapper.BackdiscussmsgMapper;
import com.dcits.base.mapper.IndiscussmsgMapper;
import com.dcits.base.mapper.KeycodeMapper;
import com.dcits.base.mapper.PrediscussmsgMapper;
import com.dcits.base.mapper.UserMapper;
import com.dcits.base.pojo.Backdiscussmsg;
import com.dcits.base.pojo.BackdiscussmsgExample;
import com.dcits.base.pojo.Indiscussmsg;
import com.dcits.base.pojo.IndiscussmsgExample;
import com.dcits.base.pojo.Keycode;
import com.dcits.base.pojo.KeycodeExample;
import com.dcits.base.pojo.KeycodeExample.Criteria;
import com.dcits.base.pojo.Prediscussmsg;
import com.dcits.base.pojo.PrediscussmsgExample;
import com.dcits.base.pojo.User;

@Service
public class PreDiscussMsgServices {

	@Autowired
	private PrediscussmsgMapper preDiscussMsgMapper;
	
	@Autowired
	private IndiscussmsgMapper inDiscussMsgMapper;
	
	@Autowired
	private BackdiscussmsgMapper backDiscussMsgMapper;
	
	@Autowired
	private UserServices userServices;
	

	public Prediscussmsg getPreMsgBySid(int sid) {
		return preDiscussMsgMapper.selectByPrimaryKey(sid);
	}
	
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
	
	@Transactional
	public int alterPreMsgProfessionalBySid(Prediscussmsg record) {
		PrediscussmsgExample example = new PrediscussmsgExample();
		com.dcits.base.pojo.PrediscussmsgExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andSidEqualTo(record.getSid());
		if(preDiscussMsgMapper.updateByExampleSelective(record, example) > 0) {
			//先删掉
			IndiscussmsgExample iex = new IndiscussmsgExample();
			com.dcits.base.pojo.IndiscussmsgExample.Criteria createCriteria2 = iex.createCriteria();
			createCriteria2.andPdmSidEqualTo(record.getSid());
			inDiscussMsgMapper.deleteByExample(iex);
			
			BackdiscussmsgExample bex = new BackdiscussmsgExample();
			com.dcits.base.pojo.BackdiscussmsgExample.Criteria createCriteria3 = bex.createCriteria();
			createCriteria3.andPdmSidEqualTo(record.getSid());
			backDiscussMsgMapper.deleteByExample(bex);
			
			//再赋值
			String[] strs = record.getRemark().split("\\|");
			if(strs.length == 2) {//指派了人员
				User user = userServices.selectAUserByItcode(strs[1]);
				
				Indiscussmsg ird = new Indiscussmsg();
				ird.setPdmSid(record.getSid());
				ird.setUserSid(user.getSid());
				ird.setDiscussProficient(user.getName());
				
				Backdiscussmsg brd = new Backdiscussmsg();
				brd.setPdmSid(record.getSid());
				brd.setUserSid(record.getUserId());
				backDiscussMsgMapper.insert(brd);
				
				return inDiscussMsgMapper.insert(ird);				
			}
			return 1;
		}
		return 0;
	}
	
	public int addPreMsg(Prediscussmsg msg) {
		return preDiscussMsgMapper.insert(msg);
	}
	
}
