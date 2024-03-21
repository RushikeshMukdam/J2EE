package com.jspiders.sparingcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.sparingcore.beans.User;

public class User2Main {
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user_config2.xml");
		   Object user1 =  applicationContext.getBean(User.class);
		   System.out.println(user1);
		 ((ClassPathXmlApplicationContext)  applicationContext).close();
	
	
	}

}
