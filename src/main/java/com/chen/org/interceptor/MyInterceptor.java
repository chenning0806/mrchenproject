package com.chen.org.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor{
	int i = 1;
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		if(i == 1){
			System.out.println(this);
			System.out.println("interceptor!!!!!!!!!!!!!!!!!!!!!!!!");
			i++;
		}
		if(i == 2){
			System.out.println(this);
			System.out.println("interceptor2!!!!!!!!!!!!!!!!!!!!!!!!");
			i = 1;
		}
		
		return true;
	}

}
