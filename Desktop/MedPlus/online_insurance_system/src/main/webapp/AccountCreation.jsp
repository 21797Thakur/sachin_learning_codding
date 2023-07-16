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
<form action="AccountCreation" method ="post">
<label>Insured Name :</label> <input type = "text" name = "insuredname" required="required"><br>
<label>Insured Street :</label> <input type = "text" name = "insuredstreet" required="required"><br> 
<label>Insured City :</label> <input type = "text" name = "insuredcity" required="required"><br>
<label>Insured State :</label> <input type = "text" name = "insuredstate" required="required"><br>
<label>Insured Zip :</label> <input type = "number" name = "insuredzip" required="required"><br>
<label>Busiess Segment :</label>
<select name= "businesssegment" required="required">
<c:forEach var ="BusSeg" items="${listBusSeg}">
 <option value="${BusSeg}">${BusSeg}</option>
  </c:forEach>
</select > <br> 
<input type="hidden" name="username" value="${username}">
<p class="button" align= "left"><a href ="home.jsp" ><input type="button" value="Home"></a></p>
<p class="button" align="center"><input type ="submit" value="Create"></p>
<p class="btRight" align= "right"><a href =""><input type="button" value="?"></a></p>
</form>
</div>
</body>
</html>