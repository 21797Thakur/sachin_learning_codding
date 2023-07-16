
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String user = request.getParameter("username");
	String password = request.getParameter("password");

	if (user.equals("admin") && password.equals("admin")) {
	%>
	<%session.setAttribute("login_user", user); %>
	<jsp:forward page="UseBean.jsp"></jsp:forward>
	<%
	} else if (user.isEmpty() || password.isEmpty()) {
	%>
	<font color="red"> Un-authorized user</font>
	<jsp:include page="login.jsp"></jsp:include>
	<%
	} else {
	%>
	<h1>
		Welcome
		<%=user%></h1>
		<a href="login.jsp"></a>
	<%
	}
	%>
</body>
</html>