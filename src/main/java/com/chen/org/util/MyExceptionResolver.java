package com.chen.org.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3) {
		PrintWriter writer = null;
		arg1.setContentType("text/html; charset=UTF-8");
		if(!(arg3 instanceof ArithmeticException)){
			ModelAndView modelAndView = new ModelAndView("exception");
			modelAndView.addObject("ex", arg3.getMessage());
			return modelAndView;
		}else{
			try {
				writer = arg1.getWriter();  
				
				writer.write("ajax 错误信息");  
				writer.flush();
			} catch (IOException e) {
				
			}finally{
				writer.close();
			}  
				return null;
//			ModelAndView modelAndView = new ModelAndView("exception2");
//			modelAndView.addObject("ex", arg3.getMessage());
//			return modelAndView;
		}
		
	}

}
