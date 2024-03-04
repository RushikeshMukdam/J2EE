package com.jspiders.designpattern.structural;

public class AdapterMain {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		
		adapter.setName("Rohan");
		adapter.meansDay();
		
		adapter.setName("Roshani");
		adapter.womansDay();
		
	}
}
