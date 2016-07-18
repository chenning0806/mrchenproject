package com.chen.org.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.mysql.fabric.xmlrpc.base.Array;
import com.rabbitmq.client.AMQP.Confirm.Select;

public class Excel {

	public static void main(String[] args) throws Exception{
		Demo d = Demo.spring;
		
		System.out.println(select1(1));
//		FileInputStream in = new FileInputStream(new File("/Users/ChenNing/Desktop/1.txt"));
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/ChenNing/Desktop/1.txt")));
//		int i = 0;
//		while((i=bufferedReader.read())!=-1){
//			System.out.println(i);
//			System.out.println((char)i);
//		}
//		
	}
	
	public static String select1(int s){
		int i = 1;
		switch (s) {
		case 1:
			s++;
			
		case 2:
			s++;
			break;

		default:
			return "default";
		}
		return s+"";
	}
}
