<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Insurance Generation System</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/> 
<style type="text/css">
body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #0ca3d2;
}
</style>
</head>
<body>
<div  class="tableView">
<h1>Create Policy </h1>
<% int i=1 ; %>
<%-- List<String> questList=  new ArrayList<String>();--%>
 <form method="post" action="PolicyCreation">
 <c:forEach var="qlist" items="${questionlist}">
<label>Question <%=i++ %> : ${qlist.quesDesc}.</label><br>
 <p class="radio"><input type = "radio" name = "${qlist.quesDesc}" required="required" value="${qlist.ans1Weightage}">
 <label for="ans1">${qlist.quesAns1}</label>
 </p>
 <p class="radio"><input type = "radio" name = "${qlist.quesDesc}" required="required" value="${qlist.ans2Weightage}">
  <label for="ans2">${qlist.quesAns2}</label></p>
 <p class="radio"><input type = "radio" name = "${qlist.quesDesc}" required="required" value="${qlist.ans3Weightage}">
  <label for="ans3">${qlist.quesAns3}</label></p>
 </c:forEach>
 <% i=1; %>
    <p class="submit"><input type="submit" value="Create Policy"></p>
  </form>
</div>
</body>
</html>