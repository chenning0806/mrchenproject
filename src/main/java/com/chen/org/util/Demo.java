package com.chen.org.util;


public enum Demo {
	spring("spring","1");
	
	String key;
	String value;
	
	
	public String getKey() {
		return key;
	}


	public String getValue() {
		return value;
	}


	Demo(String key,String value ){
		this.key=key;
		this.value=value;
	}
}
