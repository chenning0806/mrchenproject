package mrchenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.org.interceptor.TestInterceptor;
import com.chen.org.service.TesService;
import com.chen.org.service.impl.TestServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext.xml","classpath:config/mybatis/spring-mybatis.xml"})
public class AopTest {
	
//	@Autowired 
//	TesService tesService;
	@Test
	public  void main() throws FileNotFoundException, IOException {
		
		
		TesService object = new TestServiceImpl();
		
		TestInterceptor testInterceptor = new TestInterceptor(object);
		
		TesService tesService = (TesService) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), testInterceptor);
		
		String textString = tesService.printText("canshu");
		
		System.out.println(textString);
	}
}
