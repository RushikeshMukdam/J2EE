package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creation.SingletonLazy;

public class singletonLazyMain {

	public static void main(String[] args) {
		SingletonLazy singletonLazy1 = SingletonLazy.getObject();
		System.out.println(singletonLazy1);
		
		SingletonLazy singletonLazy2 = SingletonLazy.getObject();
		System.out.println(singletonLazy2);
		
		System.out.println(SingletonLazy.getObject());
	}
}
