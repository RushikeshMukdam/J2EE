package com.jspiders.sparingcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.sparingcore.beans.Person;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person_config.xml");
		  Person person =(Person) applicationContext.getBean("person");
		System.out.println(person);
		  ((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
