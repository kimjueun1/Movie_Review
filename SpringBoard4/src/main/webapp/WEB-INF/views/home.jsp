<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>
<h1>
	Hello world!  (Board List)
</h1>

<P>  The time on the server is ${serverTime}. </P>
<img src="./img/img123.png" width=300 />
<table>
<c:forEach items="${list}" var="one">
	<tr><td>${one}</td></tr>
</c:forEach>
</table>
</body>
</html>
