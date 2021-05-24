<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> ADDITIONAL STUDENT INFORMATION </title>
</head>
<body>
	
	<%
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String gender = request.getParameter("gender");
	String college = request.getParameter("college");
	String department = request.getParameter("department");
	%>

<form action="SelectCollege"  method = "post">

<input name="fname" value ="<%= fname%>" type="hidden">
<input name="lname" value ="<%= lname%>" type="hidden">
<input name="gender" value ="<%= gender%>" type="hidden">
<input name ="college" value ="<%= college%>" type="hidden">
<input name ="department" value ="<%= department%>" type="hidden">

	<label>Father Name: </label>
	<input type = "text" id = father_name name = father_name>
	
	<br>
	
	<label>Mother Name: </label>
	<input type = "text" id = mother_name name = mother_name>
	
	<br>
	
	<label>Email Id</label>
	<input type = "text" id = email name = email>
	
	<br>
	
	<input type = "submit" value = "SUBMIT">
	
	</form>
</body>
</html>