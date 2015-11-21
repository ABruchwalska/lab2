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
<jsp:useBean id="book" class="com.example.servletjspdemo.domain.Ksiazka" scope="session" />

<form action="addPerson.jsp">

  Autor :<input type="text" name="autor"/><br />
  Tytul :<input type="text"  name="tytul"/><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>