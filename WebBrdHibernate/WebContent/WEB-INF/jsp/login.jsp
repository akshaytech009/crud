<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>

</head>
<<body>`


<h1 align="center" style="color: red">${msg1}</h1>

<h1 align="center">LOGIN PAGE</h1>
<form method="post" action="Login">
<div align="center">
<table cellpadding="5px" cellspacing="5px" style="width:30%">

<tr><th align="center">Enter UserID</th><th align="center"><input type="text" name="userid" required="required" placeholder="Enter UserID"></th></tr><br>
<tr><th align="center">Enter Password</th><th align="center"><input type="password" name="userpass" required="required" placeholder="Enter password"></th></tr>
<tr><th></th><th></th></tr>
<tr><th></th><th></th></tr>


<tr><th colspan="2"><input type="submit" name="submit"><input type="reset" name="reset"></th></tr>

</table>

<a href="CustomerController?operation=roar">Register Here</a>

</div>
</form>

<script type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</script>
<body onload="noBack();"
    onpageshow="if (event.persisted) noBack();" onunload="">



</body>
</html>