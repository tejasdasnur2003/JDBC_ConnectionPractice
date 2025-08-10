<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<h1>Add Employee </h1>
<form action="/savedata" method="post">
<pre>
First Name :<input type="text"  name="fname"/>

Last Name  :<input type="text" name="lname"/>

    E-Mail  :<input type="email" name="email"/>
    
    Contact No :<input type="number" name="mobile"/>
 
 	<input type="submit" value="Save Lead"/>
    		
 Click here <a href="http://localhost:8080/listall">List of Employee</a> to see the Employee Details

</pre>
</form>

</body>
</html>