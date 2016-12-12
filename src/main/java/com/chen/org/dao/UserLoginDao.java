package com.chen.org.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.chen.org.bean.UserPO;

@Repository
public interface UserLoginDao {
	UserPO login(Map<String, String> map);

	int saveUser(Map<String, String> map);
	
	List<UserPO> get(@Param("list")List<String> list,@Param("password")String password);
	
	Integer update();
}
