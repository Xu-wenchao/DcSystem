package com.dcits.base;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dcits.base.mapper.MyMapper;
import com.dcits.base.pojo.Menu;
import com.dcits.base.pojo.Role;
import com.dcits.base.pojo.User;
import com.dcits.base.service.UserServices;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DcitsManagerSystemApplicationTests {

	@Autowired
	private UserServices userServices;
	
	@Autowired
	private MyMapper myMapper;
	
	@Test
	public void contextLoads() {
		List<User> selectAllActiveUser = userServices.selectAllActiveUser();
		System.out.println(selectAllActiveUser.size());
	}
	
	@Test
	public void testMenuAndPower() {
		HashMap<String, Object> role = myMapper.getRole(1);
		System.out.println(role);

	}

}
