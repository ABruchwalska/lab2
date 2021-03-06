<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiegarnia</title>
</head>
<body>
<jsp:useBean id="book" class="com.example.servletjspdemo.domain.Ksiazka" scope="session" />

<jsp:setProperty name="book" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.KsiazkaStorage" scope="application" />

<% 
  storage.dodajKsiazka(book);
%>

<p>Podana ksiazka zostala dodana do biblioteki: </p>
<p>Autor: <jsp:getProperty name="book" property="autor"></jsp:getProperty> </p>
<p>Tytul: <jsp:getProperty name="book" property="tytul"></jsp:getProperty></p>
<p>
  <a href="showAllKsiazkas.jsp">Pokaz wszystkie ksiazki</a>
</p>
</body>
</html>