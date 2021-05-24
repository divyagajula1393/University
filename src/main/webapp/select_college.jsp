<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT DETAILS</title>
</head>
<body>

<%

	String college = request.getParameter("college");
	String department = request.getParameter("department");


%>
	<form action="additional_student_info.jsp" method = "post">
	
		<input name = "college" value = "<%= college%>" type = "hidden">
		<input name = "department" value = "<%= department%>" type = "hidden">
			
		<label>First Name : </label>
		<input type = "text" id = "fname" name = "fname"><br>
		
		<label>Last Name : </label>
		<input type = "text" id = "lname" name = "lname"><br>
		
		<label>Gender: </label>
		
		<input type = "radio" name = "gender" value = "male">
		<label>Male </label>
		
		<input type = "radio" name = "gender" value = "female">
		<label>Female </label>
		
		<br>
		<input type="submit" value="SUBMIT"/>
	
	
	</form>
</body>
</html>