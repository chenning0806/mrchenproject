package mrchenproject;

import java.net.Socket;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import javax.naming.AuthenticationException;

public class ExtendsTest {
	static int i ;
	static String string;
	public static void main(String[] args) {
		System.out.println("当前JVM的默认字符集：" + Charset.defaultCharset());
		  System.out.println(  SingleTon.getInstans());
		  if(i==0) throw new Fu("12312312");

		 }

}
