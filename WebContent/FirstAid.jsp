<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><center><h4>your Fist Aid Tips is......</h4></center>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>firstaid</title>
</head>
<body background="#B0C4DE">
<center>
<table>
<tr>
<td>FirstAidProblem</td><td><input type="text" value="<%=request.getSession().getAttribute("fap") %>"></td>
</tr>
<tr>
<td>FirstAidTip</td><td><textarea rows="4" cols="50"><%= request.getSession().getAttribute("fat") %></textarea></td>
</tr>
</table><br></br>
Click here to go <a href="/E-Health_Care/Home.html">Home Page</a>
</center>

</body>
</html>