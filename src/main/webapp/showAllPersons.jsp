<%@page import="com.example.servletjspdemo.domain.Ksiazka"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiegarnia</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<%
  for (Ksiazka Ksiazka : storage.getAllKsiazkas()) {
	  out.println("<p>Autor: " + Ksiazka.getAutor() + "; Tytul: " + Ksiazka.getTytul() + "</p>");
  }
%>
<p>
  <a href="getPersonData.jsp">Dodaj inna ksiazke</a>
</p>

</body>
</html>