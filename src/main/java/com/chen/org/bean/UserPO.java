package com.chen.org.bean;

import java.io.Serializable;
import java.util.HashMap;

public class UserPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5570332474310653267L;

	private String username;
	
	private String password;
	
	private HashMap<String, String> grade;
	
	
	
	

	public HashMap<String, String> getGrade() {
		return grade;
	}

	public void setGrade(HashMap<String, String> grade) {
		this.grade = grade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
