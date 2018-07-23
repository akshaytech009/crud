<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Showing All Users</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

<table id="example" cellspacing="2px"  class="display" width="60%" border="1" cellspacing="2px">
<thead>
            <tr style="color:maroon;">
             <th>Customer Id</th>
                <th>Customer Code</th>
                <th>Customer Name</th>
                <th>Customer ADDRESS 1</th>
                 <th>Customer ADDRESS 2</th>
                  <th>PinCode</th>
                   <th>Email Address</th>
                    <th>Contact Number</th>
                     <th>PRIMARY CONTACT PERSON </th>
                      <th>Record Status</th>
                       <th>Flag</th>
                        <th>Created Date </th>
                         <th>Created By </th>
                          <th>MODIFIED DATE</th>
                           <th>MODIFIED BY</th>
                            <th>AUTHORIZED DATE</th>
                             <th>AUTHORIZED BY</th>
                             
            </tr>
        </thead>
      
   
         <tbody>
       
               
              <c:forEach items="${customer}" var="customers"> 
               
			   <tr> 
			             <td>${customers.getCustomerId()}</td> 
                           <td>${customers.getCustomerCode()}</td>
                           <td>${customers.getCustomerName()}</td>
                           <td>${customers.getCustomerAddress1()}</td>
                           <td>${customers.getCustomerAddress2()}</td>
                           <td>${customers. getCustomerPinCode()}</td>
                           <td>${customers.getEmailAddress()}</td>
                           <td>${customers.getContactNumber()}</td>
                           <td>${customers.getPrimaryContactPerson()}</td>
                           <td>${customers.getRecordStatus()}</td>
                           <td>${customers.getActiveInactiveFlag()}</td>
                           <td>${customers.getCreateDate()}</td>
                           <td>${customers.getCreatedBy()}</td>
                           <td>${customers.getModifiedDate()}</td>
                           <td>${customers.getModifiedBy()}</td>
                           <td>${customers.getAuthorisedDate()}</td>
                           <td>${customers.getAuthorisedBy()}</td>
                           
                        
                          
                           
                    </tr>
		    </c:forEach>
		     
        </tbody> 
    
        </table>
        
<!--  <script src="https://code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script>
$(document).ready(function()
{
    $('#example').DataTable();
} );
</script>-->
</body>
</html>