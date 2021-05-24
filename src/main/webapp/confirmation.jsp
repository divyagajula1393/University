<%@page import="university.model.Student"%>
<%@page import="university.model.Response"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<%
	Response res = (Response)session.getAttribute("responseEntity");
	//Response res = (Response)request.getAttribute("responseEntity");
	Student studObj = res.getStudent(); 
	String statObj = res.getStatus();
	
%>

<table width='400px' align='center' border=0> 
<tr style='background-color:#8FBC8F;'>
<td align='center'><b>Status message</b></td>
<td align='center'><b>Roll Number</b></td>
<td align='center'><b>Fast Name</b></td>
<td align='center'><b>Last Name</b></td>
</tr> 
<tr>
<td align='center'> <%= statObj %> </td>
<td align='center'> <%= studObj.getRoll() %> </td>
<td align='center'> <%= studObj.getFname() %></td>
<td align='center'> <%= studObj.getLname() %></td>
</tr>
</table>
</body>
</html>

