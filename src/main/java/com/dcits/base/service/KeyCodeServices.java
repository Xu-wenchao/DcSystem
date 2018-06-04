package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.KeycodeMapper;
import com.dcits.base.pojo.Keycode;
import com.dcits.base.pojo.KeycodeExample;
import com.dcits.base.pojo.KeycodeExample.Criteria;

@Service
public class KeyCodeServices {
	
	@Autowired
	private KeycodeMapper keyCodeMapper;
	
	public List<Keycode> getKeyCodeByFtype(String ftype){
		KeycodeExample example = new KeycodeExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFtypeEqualTo(ftype);
		return keyCodeMapper.selectByExample(example );
	}

	public List<Keycode> getTaskTypes() {
		//ftype == 1
		return getKeyCodeByFtype("1");
	}
	public List<Keycode> getProposerDeparts() {
		//ftype == 2
		return getKeyCodeByFtype("2");
	}
	public List<Keycode> getResultTypes() {
		//ftype == 3
		return getKeyCodeByFtype("3");
	}
}
