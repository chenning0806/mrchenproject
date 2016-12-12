package com.chen.org.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserPO<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5570332474310653267L;

	private String username;
	
	private String password;
	
	private String passwords;
	
	private T wrapper;
	
	
	
	public T getWrapper() {
		return wrapper;
	}

	public void setWrapper(T wrapper) {
		this.wrapper = wrapper;
	}

	private Map<String, String> grade;
	
	
	
	

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Map<String, String> getGrade() {
		return grade;
	}

	public void setGrade(Map<String, String> grade) {
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
