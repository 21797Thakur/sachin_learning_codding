<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Insurance Generation System</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%
	request.getSession().setAttribute("account", null);
	%>
	<p class="logout">
		<a href="Logout"><input type="button" value="logout"></a>
	</p>
	<div class="login">
		<h1>welocome</h1>
		<form>
			<c:if test="${role=='admin'}">
				<p class="click">
					<a href="UserCreation"><input type="button"
						value="New Profile Creation"> </a>
				</p>
			</c:if>
			<c:if test="${role=='insured' && account =='notcreated'}">
				<p class="click">
					<a href="AccountCreation"><input type="button"
						value="Account Creation"> </a>
				</p>
			</c:if>
			<c:if test="${role=='agent' || role =='admin'}">
				<p class="click">
					<a href="AccountCreation"><input type="button"
						value="Account Creation"> </a>
				</p>
				<p class="click">
					<a href="PolicyGeneration"><input type="button"
						value="Policy Creation"> </a>
				</p>
			</c:if>
			<p class="click">
				<a href="ViewPolicy"><input type="button" value="View Policy">
				</a>
			</p>
			<c:if test="${role=='admin'}">
				<p class="click">
					<a href="PolicyReportView"><input type="button"
						value="Report Generation"> </a>
				</p>
			</c:if>
		</form>
	</div>
</body>
</html>