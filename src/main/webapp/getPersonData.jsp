<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>title</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="Ksiazka" class="com.example.servletjspdemo.domain.Ksiazka" scope="session" />

<form action="addPerson.jsp">

  Author :<input type="text" name="Autor" value="${Ksiazka.autor}" /><br />
  Title :<input type="text"  name="Tytul" value="${Ksiazka.tytul}" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>