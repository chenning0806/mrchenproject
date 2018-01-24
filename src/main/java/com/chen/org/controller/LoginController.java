package com.chen.org.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.org.bean.OrderParam;
import com.chen.org.bean.UserPO;
import com.chen.org.service.LoginService;

@Controller
public class LoginController {
	protected  Logger LOG = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	LoginService loginService;
//	@Autowired  
//    private ApplicationContext applicationContext; 
//	@Autowired
//	DemoService demoService;
//	@Autowired
//	private SendQueueProvider sendQueueProvider;
	
	@Value("${jdbc.username}")
	public String user;

	@RequestMapping(value="/login.do")
	@ResponseBody
	public UserPO login(@RequestParam()String username,
						@RequestParam()String password) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("password", password);
		UserPO user = loginService.loginService(map);
		return user;
	}
	


	@RequestMapping("/index.do")
	public String getPage(UserPO userPO) {
//		int i = 1/0;
		return "index";
	}
	

	@RequestMapping("/saveUser.do")
	@ResponseBody
	public Object saveUser(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("password", password);
		int i = loginService.saveUser(map);
		return i;
	}
	public static void main(String[] args) {

       //classpath
        System.out.println(LoginController.class.getClassLoader().getSystemResource(""));
    }
}
