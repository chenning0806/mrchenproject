package mrchenproject;

import java.nio.charset.Charset;

import javax.naming.AuthenticationException;

public class ExtendsTest {
	static int i ;
	static String string;
	public static void main(String[] args) {
		System.out.println("当前JVM的默认字符集：" + Charset.defaultCharset());
		  System.out.println(  SingleTon.getInstans());
		  try{
//			  throw new Fu();
			  System.out.println(string);
			  System.out.println(i);
		  }catch (Fu myExp){
			  myExp.printStackTrace();
		  }catch (ArithmeticException e) {
			// TODO: handle exception
			  System.out.println("successful!");
		  }

		 }

}
