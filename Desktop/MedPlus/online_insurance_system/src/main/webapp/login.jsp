<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="login">
  <h1>Login</h1>
  <form method="post" action="LoginValidate">
    <p><input type="text" name="username" value="" placeholder="Username" required="required"></p>
    <p><input type="password" name="password" value="" placeholder="Password" required="required"></p>
    <p class="submit"><input type="submit" name="commit" value="Login"></p>
  </form>
</div>
</body>
</html>