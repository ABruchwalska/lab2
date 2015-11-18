package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/data")
public class DataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String selectedKategoria = "";
		for (String kategoria : request.getParameterValues("kategoria")) {
			selectedKategoria += kategoria + " ";
		}
		out.println("<html><body><h2>Twoja odpowiedz</h2>" +
				"<p>Autor: " + request.getParameter("wypelniajacy") + "<br />" +
				"<p>Ulubiony kategoria ksiazki: " + selectedKategoria + "<br />" +
				"</body></html>");
		out.close();
	}

}
