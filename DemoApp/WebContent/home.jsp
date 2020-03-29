
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	
	
	<%@page import="java.util.Scanner"%>
	
	<%!
		int coef = 3;
		Scanner scan = new Scanner(System.in);
	
	%>
	
	<%
		out.println(7+5);
	%>

	My favourite number is :: <%= coef%>

</body>
</html>