package com.dcits.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcits.base.mapper.MenuMapper;
import com.dcits.base.pojo.Menu;
import com.dcits.base.pojo.MenuExample;

@Service
public class MenuServices {

	@Autowired
	private MenuMapper menuMapper;
	
	public List<Menu> getAllMenus(){
		return menuMapper.selectByExample(new MenuExample());
	}
	
	public int addMenu(Menu menu) {
		return menuMapper.insert(menu);
	}
}
