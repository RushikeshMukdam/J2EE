package com.jspiders.designpattern.structural;

public class Adapter extends Emplyees implements Function1{
	
	public void womansDay() {
		System.out.println("The Chef geast for womens day is "+ getName());
	}

	@Override
	public void meansDay() {
		System.out.println("The Chef geast for men's Day is "+ getName());
		
	}
}
