package mrchenproject;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sun.security.jgss.LoginConfigImpl;

import com.chen.org.dao.UserLoginDao;
import com.chen.org.service.LoginService;
import com.chen.org.service.impl.TestServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext.xml","classpath:config/mybatis/spring-mybatis.xml"})
public class SpringBeanTest {
	@Autowired
	TestServiceImpl testServiceImpl;
	@Autowired
	LoginService loginConfigImpl;
	@Autowired 
	UserLoginDao userLoginDao;
	@org.junit.Test
	public void test1() {
		
		
		System.out.println(testServiceImpl);
	
	}
}
