<%@page import="com.example.servletjspdemo.domain.Ksiazka"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiegarnia</title>
</head>
<body>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.KsiazkaStorage" scope="application" />
<%
ArrayList list = storage.getKsiazkiMap();
pageContext.setAttribute("ksiazki", list);
%>
<table>
<th>ID</th>
<th>Tytul</th>
<th>Autor</th>
<th>Usun</th>
<th>Edytuj</th>
<c:forEach items="${ksiazki}" var="ksiazka">
<tr>
<td><c:out value="${ksiazka.id}"/></td>
<td><c:out value="${ksiazka.tytul}"/></td>
<td><c:out value="${ksiazka.autor}"/></td>
<td><a href='deleteKsiazka.jsp?id=<c:out value="${ksiazka.id}" />'>Usun</td>
<td><a href='editKsiazka.jsp?id=<c:out value="${ksiazka.id}" />'>Edit</td>
</c:forEach>
</table>
<p>
<a href="getPersonData.jsp">Dodaj inna ksiazke</a>
</p>
</body>
</html>