package com.chen.org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.chen.org.bean.UserPO;
import com.chen.org.dao.UserLoginDao;
import com.chen.org.service.LoginService;
import com.chen.org.util.MultipleDataSource;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired 
	UserLoginDao userLoginDao;
	@Value("${jdbc.username}")
	public String user;
	
	
	@Override
	public UserPO loginService(Map<String, String> map){
		return userLoginDao.login(map);
	}

	@Override
	public int saveUser(Map<String, String> map) {
		int i = userLoginDao.saveUser(map);
		return i;
	}

}
