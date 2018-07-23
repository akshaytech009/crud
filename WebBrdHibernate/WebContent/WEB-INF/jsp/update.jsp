<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update View</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <script>
function validation()
{
var numbers = /^[0-9]+$/;
var con=document.custform.custnumber.value;
var name=document.custform.custname.value;
var letters = /^[A-Za-z]+$/;
var add1=document.custform.custaddress1.value;
var count=0;
var pin=document.custform.custpincode.value;

 if (name==null || name=="")
{
alert("Please enter your name.");
      count++;
  }


 if(name.match(letters))
{

}
else
{
alert('Customer Name must have alphabet characters only');
count++;
}



if((con.match(numbers)))
{

}
else{
alert('Should be numbers');
count++;}


if(con.length==0)
{
alert('contact field empty');
}

if(add1.length==0)
{
alert('Address field empty');
}


if(con.length!=10)
{
alert('Contact number length should be 10');
return false;
}
if(pin.length!=6)
{
alert('Pin code length should be 6');
return false;
}



if(flag)
{
alert('Please Enter the Right Details for login');
return false;
}
else return true;
}

 
</script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <ul class="row nav navbar-nav">
      
      <li class="col"><a href="CustomerController?operation=new">New</a></li>
      <li class="col"><a href="CustomerController?operation=update">Update</a></li>

      <li class="col dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View
<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="CustomerController?operation=viewsingle">Single</a></li>
          <li><a href="CustomerController?operation=viewall">All</a></li>

        </ul>
      </li>
	<li class="col"><a href="CustomerController?operation=delete">Delete</a></li>
      <li class="col"><a href="CustomerController?operation=logout">Logout</a></li> 
   </ul>
  </div>
</nav>

<form method="post" action="CustomerController?operation=joke" name="custform"onsubmit="return validation()">
<div align="center">
<table cellspacing="2px">
<tr><th style="color: maroon">CustomerId:</th><th><input type="text" name="custid" value="${customer.getCustomerId()}" readonly="readonly"></th></tr>		
<tr><th style="color: maroon">CustomerCode:</th><th><input type="text" name="custcode" value="${customer.getCustomerCode()}" readonly="readonly"></th></tr>		
 <tr><th style="color: maroon">CustomerName:</th><th><input type="text" name="custname" value="${customer.getCustomerName()}"></th></tr>	
 <tr><th style="color: maroon">Address1:</th><th><textarea rows="8" cols="17" required="required" name="custaddress1">${customer.getCustomerAddress1()}</textarea></th></tr>	
 <tr><th style="color: maroon">Address2:</th><th><textarea rows="8" cols="17" name="custaddress2">${customer.getCustomerAddress2()}</textarea></th></tr>	
 <tr><th style="color: maroon">PinCode:</th><th><input type="number" maxlength="6" name="custpincode" value="${customer.getCustomerPinCode()}"></th></tr>		
 <tr><th style="color: maroon">E-mail Address:</th><th> <input type="email" name="custemail" value="${customer.getEmailAddress()}"></th></tr>		
 <tr><th style="color: maroon">Contact Number:</th><th> <input type="number" name="custnumber" maxlength="10" name="custcontactnum" value="${customer.getContactNumber()}"></th></tr>		
 <tr><th style="color: maroon">Primary Contact Person:</th><th> <input type="text" name="custcontactper" value="${customer.getPrimaryContactPerson()}"></th></tr>		
 <tr><th style="color: maroon">Record Status:</th><th> <input type="text" maxlength="1" name="custrecordstatus" value="${customer.getRecordStatus()}"></th></tr>	
 <tr><th style="color: maroon">Active/Inactive Flag:</th><th align="center"><select name="flag" required="required"><option value="A" selected="selected">Active Flag</option>
                                                                                                                    <option value="I">Inactive Flag</option></select></th></tr>	

<tr><th colspan="2"><input type="submit" value="update"></th></tr>

</table></div></form>






















</body>
</html>