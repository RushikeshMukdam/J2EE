package com.jspiders.sparingcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.sparingcore.beans.Employee2;

public class EmployeesMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Employees_config.xml");
		  Employee2 employee1  = (Employee2) applicationContext.getBean("employee1");
		  System.out.println(employee1);
		 ((ClassPathXmlApplicationContext) applicationContext).close();
		 
		 
		 
		 ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("Employees_config.xml");
		     Employee2 employee2  =(Employee2) applicationContext2.getBean("employee2");
		     System.out.println(employee2);
		     ((ClassPathXmlApplicationContext)applicationContext2).close();
		     
		 ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("Employees_config.xml");
		      Employee2 employee3   =(Employee2) applicationContext3.getBean("employee3");
		      System.out.println(employee3);
		      ((ClassPathXmlApplicationContext)applicationContext3).close();
		     
	}

}
