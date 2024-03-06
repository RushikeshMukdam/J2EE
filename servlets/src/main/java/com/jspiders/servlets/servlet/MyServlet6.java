package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/my_servlet6")
public class MyServlet6 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		   PrintWriter write  = resp.getWriter();
		   write.println("<h1>Responce from Myservlet6</h1>");
		     RequestDispatcher requestDispatcher = req.getRequestDispatcher("my_servlet5");
		     requestDispatcher.forward(req, resp);
		   
		   //resp.sendRedirect("my_servlet5");
	}
}
