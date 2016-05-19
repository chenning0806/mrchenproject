package springAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{

	Trancition t;
	
	GetMoney getMoneyImpl;
	
	MyProxy(Trancition t,GetMoney getMoneyImpl){
		this.t = t;
		this.getMoneyImpl = getMoneyImpl;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		t.startT();
		Object object = method.invoke(getMoneyImpl, args);
		t.closeT();
		return object;
	}

}
