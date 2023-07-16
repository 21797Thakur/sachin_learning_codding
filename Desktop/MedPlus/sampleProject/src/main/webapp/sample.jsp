<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sample JSP page</h1>
	<%!int x = 10;%>
	<%=x++%>
	<h2>
		X value is
		<%=x%>
	</h2>
	<%
	if (x > 0) {
	%>
	<h1>
		x is positive x =
		<%=x%></h1>
	<%
	} else {
	%>
	<h1>
		X is negative
		<%=x%></h1>
	<%
	}
	%>
</body>
</html>