package com.jspiders.sparingcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.sparingcore.beans.User;

public class UserMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user_config.xml");
		  Object user1 = applicationContext.getBean("user1");
		  System.out.println(user1);
		  ((ClassPathXmlApplicationContext) applicationContext).close();
  
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("user_config.xml");
		User user =(User) applicationContext2.getBean("user2");
		System.out.println(user);
		   ((ClassPathXmlApplicationContext) applicationContext2).close();
		   
		   
		 ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("user_config.xml");
		     User user3 =(User) applicationContext3.getBean("user3");
		     System.out.println(user3);
		    ((ClassPathXmlApplicationContext) applicationContext3).close();
	}

}
