package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class StudentInfo extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		 int id = Integer.parseInt(req.getParameter("id"));
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 long mobile = Long.parseLong(req.getParameter("mobile"));
		 int age  = Integer.parseInt(req.getParameter("age"));
		 
		 
		String[] courses = req.getParameterValues("course");
		    PrintWriter write = resp.getWriter();
		   write.println(id+"<br>"+name+"<br>"+email+ "<br>"+mobile+"<br>"+age+"<br>");
		   for(String course : courses) {
			   write.println(course+"<br>");
		   }
	}
}
