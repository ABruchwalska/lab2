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

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.KsiazkaStorage" scope="application" />
<%
  for (Ksiazka ksiazka : storage.getTabOb()) {
	  out.print("<p> id: " +ksiazka.getId() +" Autor: " + ksiazka.getAutor() + "; Tytul: " + ksiazka.getTytul());
	  out.print(" <a href=\"deleteKsiazka.jsp?id=" + ksiazka.getId() + "\" >Usun</a> ");
	  out.print(" <a href=\"editKsiazka.jsp?id=" + ksiazka.getId() + "\" >Edytuj</a> ");
	  out.print("</p>");
	 
  }
  //out.println(request.)
%>
<p>
  <a href="getPersonData.jsp">Dodaj inna ksiazke</a>
 <!--  <a href="delete.jsp">Usun ksiazke</a> -->
</p>

</body>
</html>