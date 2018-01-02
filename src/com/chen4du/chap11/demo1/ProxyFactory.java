package com.chen4du.chap11.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理工厂类
public class ProxyFactory {

	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("开始事务2");
				Object returnValue = method.invoke(target, args);
				System.out.println("提交事务2");
				return returnValue;
			}
		});
	}
}
