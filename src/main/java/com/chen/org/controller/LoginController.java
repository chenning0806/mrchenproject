package com.chen.org.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import mrchenproject.ReadPropertise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.org.bean.UserPO;
import com.chen.org.dubboServerApi.DemoService;
import com.chen.org.rabbit.SendQueueProvider;
import com.chen.org.service.LoginService;

@Controller
public class LoginController {
	protected  Logger LOG = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	LoginService loginService;
	
//	@Autowired
//	DemoService demoService;
//	@Autowired
//	private SendQueueProvider sendQueueProvider;
	
	@RequestMapping(value="/login.do")
	@ResponseBody
	public Object login(String username,String password,HttpServletRequest request) throws Exception{
//		List<String> list = new ArrayList<String>();
//		list.remove(1);
//		int i = 1/0;
//		System.out.println(demoService.dubboMessage());
//		sendQueueProvider.send();
		
		File file = new File("bonusexcel.txt");
		System.out.println(file.getCanonicalPath());//获取标准的路径 
	    System.out.println(file.getAbsolutePath());//获取绝对路径
		file.createNewFile();
		Map<String, String> map = new HashMap<String, String>();
		LOG.info("========log start========"+Thread.currentThread().getName());
		
		map.put("username", username);
		map.put("password", password);
		UserPO user = null;
		try {
			user = loginService.loginService(map);
		} catch (Exception e) {
			System.out.println(111);
		}
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
