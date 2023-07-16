<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Insurance Generation System</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<style >
label {
	display: inline-block;
	width: 200px;
	text-align: right;
}

</style>
</head>
<body>
	<p class="logout">
				<a href="Logout"><input type="button" value="logout"></a>
			</p>
<div class="tableView">
<h1>Create New User</h1>
<form action="UserCreation" method ="post">
<label>User Name :</label> <input type = "text" name = "username" required="required"><br>
<label>Password :</label> <input type = "text" name = "password" required="required"><br> 
<label>Role Code :</label>
<select name= "role" required="required">
<option value="">None</option>
  <option value="insured">Insured</option >
  <option value="agent">Agent</option>
  <option value="admin">Underwriter</option>
</select > <br>
<p class="button" align= "left"><a href ="home.jsp" ><input type="button" value="Home"></a></p>
<p class="button" align="center"><input type ="submit" value="Create"></p>
<p class="btRight" align= "right"><a href =""><input type="button" value="?"></a></p>
</form>
</div>
</body>
</html>