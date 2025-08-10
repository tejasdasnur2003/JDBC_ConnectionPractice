<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<td><a href="show">Add Employee</a></td>
<h2>List of All Employees</h2>
<table border=1>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>E-Mail</th>
<th>Contact No.</th>

<th>Delete</th>
<th>Update</th> 
</tr>
<c:forEach var="leads" items="${leads}">
<tr>
<td>${leads.fname}</td>
<td>${leads.lname}</td>
<td>${leads.email}</td>
<td>${leads.mobile}</td>

<td><a href="deletelead?id=${leads.id}">delete</a></td>
<td><a href="updatelead?id=${leads.id}">update</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>