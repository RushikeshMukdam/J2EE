package com.jspiders.servlets.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/my_servlet7")
public class MyServlet7 implements Servlet {

	static {
		System.out.println("class loaded");
	}

	
	{
		System.out.println("Instantiation");
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() invoked");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service() invoked");
	}
	@Override
	public void destroy() {
		System.out.println("distory() invoked");
		
	}
}
