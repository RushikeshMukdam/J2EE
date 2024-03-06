package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub")
public class Substraction  extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sub = num1-num2;
		resp.setContentType("text/html");
	     PrintWriter write =	resp.getWriter();
	     write.println("<h1> Substraction of "+num1+" and "+num2+" is = "+sub+"</h1>");
	
	}
}
