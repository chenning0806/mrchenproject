package com.chen.org.service;

import java.util.Map;

import com.chen.org.bean.UserPO;

public interface LoginService {
	UserPO loginService(Map<String, String> map);
	int saveUser(Map<String, String> map);
}
