package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class PierwszyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String currDate;

		  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		  java.util.Date date = new java.util.Date();
		  currDate = dateFormat.format(date);
		  
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Witamy w Ksiegarni! Dzisiaj jest " + currDate + "</h2></body></html>");
		out.close();
	}

}
