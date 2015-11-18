package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ankieta")
public class AnkietaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Krótka ankieta</h2>" +
				"<form action='data'>" +
				"Autor: <input type='text' name='autor' /> <br />" +
				"<input type='checkbox' name='kategoria' value='horror'>Lubię horrory<br />" +
				"<input type='checkbox' name='kategoria' value='obyczajowa'>Lubię obyczajowe<br />" +
				"<input type='checkbox' name='kategoria' value='kryminał'>Lubię kryminały<br />" +
				"<input type='checkbox' name='kategoria' value='romans'>Lubię romanse<br />" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		out.close();
	}

}
