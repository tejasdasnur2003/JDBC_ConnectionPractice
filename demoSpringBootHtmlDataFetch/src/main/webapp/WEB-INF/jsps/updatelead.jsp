<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<h1>Add Employee  </h1>
<form action="updatesavedata" method="post">
<pre>
<input type="hidden" name="id" value="${leads.id}"/>
First Name  :<input type="text"  name="fname" value="${leads.fname}"/>

Last Name   :<input type="text" name="lname" value="${leads.lname}"/>

    Email   :<input type="email" name="email"value="${leads.email}"/>
    
    Mobile  :<input type="number" name="mobile" value="${leads.mobile}"/>
    
 
    		<input type="submit" value="Update Lead"/>

</pre>
</form>

</body>
</html>