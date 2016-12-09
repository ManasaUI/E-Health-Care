<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><center><h4>Your Health Tips is....</h4></center>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>generaltips</title>
</head>
<body background="Images/healthcareBg.jpg">
<center>
<table>
<tr>
<td>Problem</td><td><input type="text" value="<%= request.getSession().getAttribute("problems") %>"></td></tr>
<tr>
<td>Tips</td><td><textarea rows="4" cols="50"><%= request.getSession().getAttribute("tips") %></textarea></td>
</tr>
</table><br></br>
Click here to go <a href="/E-Health_Care/Home.html">Home Page</a>
</center>

</body>
</html>