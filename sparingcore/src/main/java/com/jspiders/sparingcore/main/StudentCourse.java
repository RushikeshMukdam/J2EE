package com.jspiders.sparingcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.sparingcore.beans.Student;

public class StudentCourse {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student_config.xml");
		      
		
		Student student =(Student) applicationContext.getBean("student1");
		      System.out.println(student);
		  Object student2 =  applicationContext.getBean("student2");
	      		System.out.println(student2);
	      Student student3 =(Student) applicationContext.getBean("student3");
	      			System.out.println(student3);
	      ((ClassPathXmlApplicationContext) applicationContext).close();
	
	}
	
}
