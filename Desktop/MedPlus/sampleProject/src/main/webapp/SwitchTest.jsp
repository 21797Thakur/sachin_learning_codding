<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int x = 2;%>
	<%
	switch (x) {
	case 1: {
	%>
	<h1>Today is monday</h1>
	<%
	}
	break;
	case 2: {
	%>
	<h1>today is tuesday</h1>
	<%
	}
	break;
	}
	%>
</body>
</html>