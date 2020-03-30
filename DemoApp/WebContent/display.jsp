<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" 
	user ="root" password="root"/>
	
	<sql:query var="rs" dataSource="${db}">
		select * from student007
	</sql:query>
	
	<c:forEach items="${rs.rows}" var="gadget">
		<c:out value="${gadget.sid}"></c:out> :
		<c:out value="${gadget.sname}"></c:out> :
		<c:out value="${gadget.semail}"></c:out> :
		<c:out value="${gadget.smarks}"></c:out>
	</c:forEach>
	
</body>
</html>