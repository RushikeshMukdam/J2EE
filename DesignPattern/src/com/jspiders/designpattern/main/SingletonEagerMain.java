package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creation.SingletonEager;

public class SingletonEagerMain {
	
	public static void main(String[] args) {
		SingletonEager singletonEager1 = SingletonEager.getObject();
		System.out.println(singletonEager1);
		
		SingletonEager singletonEager2 = SingletonEager.getObject();
		System.out.println(singletonEager2);
		
		System.out.println(SingletonEager.getObject());
	}
	
}
