<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>

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
<form action="CustomerController?operation=hye" method="post" name="custform"onsubmit="return validation()"><div align="center">
<table cellpadding="5px" cellspacing="5px" style="width:50%;">
<h1 align="center" style="color: red">Registration form</h1>

<tr><th align="center">Customer Code</th><th align="center"><input type="text" name="custcode" required="required" placeholder="Enter customer code"></th></tr>
<tr><th align="center">Customer Name</th><th align="center"><input type="text" name="custname" required="required" placeholder="Enter customer name"></th></tr>
<tr><th align="center">Primary Customer Address</th><th align="center"><textarea rows="8" cols="17" required="required" name="custaddress1" placeholder="Enter Customer Address"></textarea></th></tr>
<tr><th align="center">Secondary Customer Address</th><th align="center"><textarea rows="8" cols="17" name="custaddress2" placeholder="Enter Customer Address"></textarea></th></tr>
<tr><th align="center">Customer Pin Code</th><th align="center"><input type="number" maxlength="6" required="required" name="custpincode" placeholder="Enter pin code"></th></tr>
<tr><th align="center">E-mail address</th><th align="center"><input type="email" name="custemail" required="required" placeholder="Enter Email"></th></tr>
<tr><th align="center">Contact Number</th><th align="center"><input type="number" name="custnumber" maxlength="10" placeholder="Enter Contact Number"></th></tr>
<tr><th align="center">Primary Contact Person</th><th align="center"><input type="text" name="custcontperson" required="required" placeholder="Enter Contact person"></th></tr>
<tr><th align="center">Record Status</th><th align="center"><input type="text" name="custrecordstatus" required="required" maxlength="1" placeholder="Enter Record Status"></th></tr>
<tr><th align="center">Active/Inactive Flag</th><th align="center"><select name="flag" required="required"><option value="A">Active Flag</option>
<option value="I">Inactive Flag</option></select></th></tr>
                            <tr><th></th><th></th></tr>     
                            <tr><th></th><th></th></tr>                                                                           
<tr><th colspan"2" align="center"><input type="submit" name="submit" style="margin-left: 55%">&nbsp &nbsp &nbsp &nbsp<input type="reset" name="reset"></th></tr>
</table>
</div></form>

</body>
</html>