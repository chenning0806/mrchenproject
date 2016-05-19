package com.chen.org.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import mrchenproject.ReadPropertise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.org.bean.UserPO;
import com.chen.org.dubboServerApi.DemoService;
import com.chen.org.service.LoginService;

@Controller
public class LoginController {
	protected  Logger LOG = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	LoginService loginService;
	
	@Autowired
	DemoService demoService;
	
	
	@RequestMapping(value="/login.do")
	@ResponseBody
	public Object login(String username,String password) {
//		List<String> list = new ArrayList<String>();
//		list.remove(1);
//		int i = 1/0;
		System.out.println(demoService.dubboMessage());
		
		Map<String, String> map = new HashMap<String, String>();
		LOG.info("========log start========");
		map.put("username", username);
		map.put("password", password);
		UserPO user = loginService.loginService(map);
		return user;
	}
	
	@RequestMapping("/index.do")
	public String getPage(UserPO userPO) {
		int i = 1/0;
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
}
