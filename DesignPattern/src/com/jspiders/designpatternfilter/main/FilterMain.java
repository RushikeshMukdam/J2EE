package com.jspiders.designpatternfilter.main;

import java.util.Scanner;

import com.jspiders.designpatternfilter.creation.Beverages;
import com.jspiders.designpatternfilter.creation.BlackTea;
import com.jspiders.designpatternfilter.creation.GreenTea;
import com.jspiders.designpatternfilter.creation.LemonTea;
import com.jspiders.designpatternfilter.creation.MasalaTea;

public class FilterMain {

	public static void main(String[] args) {
		try {
			filter().order();
		} catch (NullPointerException e) {
			System.out.println("Enter correct choice");
			e.printStackTrace();
		}
	}
	
	public static Beverages filter() {
		Beverages beverages = null;
		
		System.out.println("Enter 1 for Masala Tea \nEnter 2 for GreenTea \nEnter 3 for Lemon tea \nEnter 4 For black tea");
		
		System.out.println("Enter your choice ");
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			beverages = new MasalaTea();
			break;
		case 2 :
			beverages = new GreenTea();
			break;
		case 3 :
			beverages = new LemonTea();
			break;
		case 4 :
			beverages = new BlackTea();
			break;

		default:
			System.out.println("invalid Choice");
			break;
		}
		
		return beverages;
	}
}
