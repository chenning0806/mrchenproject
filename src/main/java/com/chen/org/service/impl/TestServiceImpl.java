package com.chen.org.service.impl;

import org.springframework.stereotype.Service;

import com.chen.org.service.TesService;

@Service
public class TestServiceImpl implements TesService {

	@Override
	public String printText(String username) {
		
		System.out.println("目标类方法执行。。。。。。。。");
		
		return "successful";
		
		
	}

}
