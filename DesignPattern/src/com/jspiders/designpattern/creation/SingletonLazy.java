package com.jspiders.designpattern.creation;

public class SingletonLazy {
	
	static SingletonLazy singletonLazy;
	
	private SingletonLazy(){
		System.out.println("Constructor is created");
	}
	
	public static  SingletonLazy getObject() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}

}
