<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% if (request.getSession().getAttribute("login_user")== null){ %>
<h1>login first</h1>
<%}else{ %>
<jsp:useBean id="emp" class="sampleProject.hello.Employee"></jsp:useBean>
<jsp:setProperty property="code" name="emp" value="12345" />
<jsp:setProperty property="empname" name="emp" value ="medplus"/>
<br>
<h1>Code = 
<jsp:getProperty property="code" name="emp"/>
</h1><br>
<h1>EmpName =
<jsp:getProperty property="empname" name="emp"/>
</h1>
<%} %>
<a href="login.jsp">login</a>
</body>
</html>