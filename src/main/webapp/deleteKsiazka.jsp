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
  int id = Integer.parseInt(request.getParameter("id"));
  storage.usunPozycje(id);
%>
	<p>Usunieto ksiazke</p>
	<p>
  <a href="showAllKsiazkas.jsp">Powrot</a>
</p>
</body>
</html>