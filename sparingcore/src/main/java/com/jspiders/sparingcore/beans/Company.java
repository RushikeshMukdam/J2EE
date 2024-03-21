package com.jspiders.sparingcore.beans;

import java.util.List;

import lombok.Data;

@Data
public class Company {
	private int id;
	private String name;
	private String loc;
	private List<Employee> employees;
	
}
