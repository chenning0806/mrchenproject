package mrchenproject;

import java.io.FileInputStream;
import java.io.IOException;

import com.chen.org.service.LoginService;


public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
		FileInputStream fileInputStream = new FileInputStream("/Users/ChenNing/Desktop/123.txt");
		byte[] bytes = new byte[1024];
		
			fileInputStream.read(bytes);
			System.out.println(new String(bytes));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@org.junit.Test
	public void name() {
		LoginService l = FactoryBean.getService();
		System.out.println(l);
	}

}
