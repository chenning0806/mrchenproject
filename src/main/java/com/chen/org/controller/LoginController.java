package com.chen.org.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	public UserPO login(String username,String password) throws Exception{
//		List<String> list = new ArrayList<String>();
//		list.remove(1);
//		int i = 1/0;
//		System.out.println(demoService.dubboMessage());
//		sendQueueProvider.send();
//		applicationContext.publishEvent(new SendNotifyEvent("今年是龙年的博客更新了"));  
		File file = new File("bonusexcel.txt");
		System.out.println(file.getCanonicalPath());//获取标准的路径 
	    System.out.println(file.getAbsolutePath());//获取绝对路径
		file.createNewFile();
		Map<String, String> map = new HashMap<String, String>();
		LOG.info("========log start========"+Thread.currentThread().getName());
		OrderParam orderParam = new OrderParam();
		OrderParam orderParam2 = new OrderParam();
		List<OrderParam> list = new ArrayList<OrderParam>();
		list.add(orderParam);
		list.add(orderParam2);
		map.put("username", username);
		map.put("password", password);
		UserPO user = null;
		user = loginService.loginService(map);
		user.setWrapper(list);
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("grade", "100");
		user.setGrade(map2);
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
	public static void main(String[] args) {

       //classpath
        System.out.println(LoginController.class.getClassLoader().getSystemResource(""));
    }
}
