<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<style>
.p1{
  margin-top: 100px;
  margin-bottom: 100px;
  margin-right: 150px;
  margin-left: 80px;
}
body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #0ca3d2;
}
</style>
</head>
<body>
	<p class="logout">
				<a href="Logout"><input type="button" value="logout"></a>
			</p>
<div class="tableView">
<h1>Policy List</h1>
<form>
<table border="2" width="500px" size ="140" align="center">
<tr>
<th>Account Number</th>
<th>Insured Name</th>
<th>Create Policy</th>
</tr>
<c:forEach var ="acc" items ="${accountlist}">
<tr>
<td>${acc.accountnumber}</td>
<td>${acc.insuredname}</td>
<td>
<a href ="PolicyCreation?userid=${acc.accountnumber}"><input type="button" value="Create Policy"></a>
</td>
</tr>
</c:forEach>
</table>
<p class="submit">
<a href ="home.jsp"><input type="button" value="Back"></a>
</p>
</form>
</div>
</body>
</html>