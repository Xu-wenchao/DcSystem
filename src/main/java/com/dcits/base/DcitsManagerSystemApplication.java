package com.dcits.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dcits.base.mapper.KeycodeMapper;

@Controller
@SpringBootApplication
public class DcitsManagerSystemApplication {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DcitsManagerSystemApplication.class, args);
	}
}
