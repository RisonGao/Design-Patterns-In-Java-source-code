package com.chen4du.chap11.demo;

//代理
public class UserDaoProxy implements IUserDao{

	private IUserDao target;
	public UserDaoProxy(IUserDao target) {
		this.target = target;
		
	}
	
	@Override
	public void save() {
		System.out.println("开始事务...");
		target.save();
		System.out.println("提交事务");		
	}
}
