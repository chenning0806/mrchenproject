package com.chen.org.bean;

import java.io.Serializable;

public class UserPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5570332474310653267L;

	private String username;
	
	private String password;

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
