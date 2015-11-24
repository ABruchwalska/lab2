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
  int id = Integer.parseInt(request.getParameter("id")); //wez z formularza parametr 'id' i zamien go na int
  String Tytul_nowy = request.getParameter("tytul"); //wartosc parametru "tytul" przechowuj w zmiennej 'tytul_nowy' typu string
  String Autor_nowy = request.getParameter("autor");// j.w.
  storage.getTabOb().get(id).setTytul(Tytul_nowy); //wez wszystkie ksiazki-> zwroc mi ksiazke o id 'id'->ustaw jej tytul na 'tytul_nowy'
  storage.getTabOb().get(id).setAutor(Autor_nowy);// j.w
%>
	<p>Zmodyfikowano ksiazke</p>
	<p>
  <a href="showAllKsiazkas.jsp">Powrot</a>
</p>
</body>
</html>