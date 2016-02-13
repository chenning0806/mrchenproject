package mrchenproject;

import com.chen.org.service.LoginService;
import com.chen.org.service.impl.LoginServiceImpl;

public class FactoryBean {
	private FactoryBean() {
		
	}
 public static LoginService getService(){
	 return new LoginServiceImpl();
 }
}
