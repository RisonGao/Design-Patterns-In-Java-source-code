package com.chen4du.chap19.demo;

//备忘录
public class Memento {

	private String state = "";
	
	
	
	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Memento(String state) {
		this.state = state;
	}
	
	
}
