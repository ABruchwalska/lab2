<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiazka</title>
</head>
<body>
	<jsp:useBean id="storage" class="com.example.servletjspdemo.service.KsiazkaStorage" scope="application" />
<jsp:useBean id="book" type="com.example.servletjspdemo.domain.Ksiazka" class="com.example.servletjspdemo.domain.Ksiazka" scope="session" />

<form action="updateKsiazka.jsp">

	<%
	
	 com.example.servletjspdemo.domain.Ksiazka ksiazka = storage.getTabOb().get(Integer.parseInt(request.getParameter("id")));
	 out.println("Autor :<input type=\"text\" value=\" "+ ksiazka.getAutor() + " \" name=\"autor\"/><br>");
	 out.println("Tytul :<input type=\"text\" value=\" "+ ksiazka.getTytul() + " \" name=\"tytul\"/>");
	%>

  <input type="submit" value=" OK ">
  
</form>
</body>
</html>