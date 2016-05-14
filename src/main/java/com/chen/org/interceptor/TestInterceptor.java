package com.chen.org.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInterceptor implements InvocationHandler{

	Object object;
	public TestInterceptor(Object object){
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		
		System.out.println("aop start......");
		Object object = method.invoke(this.object, args);
		System.out.println("aop end......");
		
		return object;
	}

}
