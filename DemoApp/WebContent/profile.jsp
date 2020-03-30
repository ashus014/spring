<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import = "java.sql.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	String url = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "root";
	String sql = "select * from student007";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
	%>
	
	RollNo : <%= rs.getInt(1) %> <br>
	Name : <%= rs.getString(2) %> <br>
	email : <%= rs.getString(3) %> <br>
	Total Percentage : <%= rs.getInt(4) 
	
	%>
	
	
	
	
</body>
</html>