package com.chen.org.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.org.bean.UserPO;
import com.chen.org.dao.UserLoginDao;
import com.chen.org.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired 
	UserLoginDao userLoginDao;
	
	@Override
	public UserPO loginService(Map<String, String> map){
		int i = 1/0;
		userLoginDao.login(map);
		return userLoginDao.login(map);
	}

	@Override
	public int saveUser(Map<String, String> map) {
		int i = userLoginDao.saveUser(map);
		return i;
	}

}
