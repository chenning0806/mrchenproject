package springAop;

import java.lang.reflect.Proxy;

public class AOPTest {

	public static void main(String[] args) {

		GetMoney getMoney = new GetMoneyImpl();
		
		Trancition trancition = new Trancition();
		
		MyProxy myProxy = new MyProxy(trancition,getMoney);
		
		GetMoney proxy = (GetMoney) Proxy.newProxyInstance(getMoney.getClass().getClassLoader(), getMoney.getClass().getInterfaces(), myProxy);
		
		String string = proxy.get();
		
		System.out.println(string);
		
	}

}
