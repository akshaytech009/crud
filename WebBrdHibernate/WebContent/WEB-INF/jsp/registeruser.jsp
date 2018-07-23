<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">REGISTER USER PAGE</h1>
<form method="post" action="CustomerController?operation=gogo">
<div align="center">
<table cellpadding="5px" cellspacing="5px" style="width:30%">

<tr><th align="center">Enter UserName</th><th align="center"><input type="text" name="username" required="required" placeholder="Enter UserName"></th></tr><br>

<tr><th align="center">Enter Password</th><th align="center"><input type="password" name="userpass" required="required" placeholder="Enter password"></th></tr>
<tr><th align="center">	Enter Role</th><th align="center"><select name="selection">
<option value="Maker"><br>Maker</option>
<option value="Checker">Checker</option></th></tr> 

</select>
<tr><th></th><th></th></tr>
<tr><th></th><th></th></tr>


<tr><th colspan="2"><input type="submit" name="submit"><input type="reset" name="reset"></th></tr>




</table>




</div>



</form>

</body>
</html>