package com.jspiders.designpattern.creation;

public class SingletonEager {
	
	
	private static SingletonEager singletonEager = new  SingletonEager();
	private SingletonEager(){
		System.out.println("Constructor is created");
	}
	
	public static SingletonEager getObject(){
		return singletonEager;
	}	
}
