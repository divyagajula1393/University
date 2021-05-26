<%@page import="university.model.Student"%>
<%@page import="university.model.Response"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW STUDENT DETAILS</title>
</head>
<body>
<%
Response res = (Response)session.getAttribute("responseEntity");
//Response res = (Response)request.getAttribute("responseEntity");
Student studObj = res.getStudent(); 
String statObj = res.getStatus();

%>
<h1>Student Details:</h1>
<h2>
Roll Number: <%=studObj.getRoll()%><br>
Student name : <%=studObj.getFname()%> <%=studObj.getLname() %><br>
Student Department Id = <%=studObj.getD_id() %><br>
Student Enrolled: <%=statObj%>

</h2>

</body>
</html>