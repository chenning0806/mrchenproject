package com.chen.org.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chen.org.bean.UserPO;

@Repository
public interface UserLoginDao {
	UserPO login(Map<String, String> map);

	int saveUser(Map<String, String> map);
}
