<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><center><h4>Hello... your details</h4></center><br></br>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>viewdetailsform</title>
</head>
<body>
<% String email = (String)session.getAttribute("email");
String pwrd = (String)session.getAttribute("pass");

System.out.println("I am"+email+"and "+pwrd);
ArrayList infoGot = (ArrayList)session.getAttribute("information");
for(Object s:infoGot)
{
	System.out.println(s.toString());
}

%>

<form action="/E-Health_Care/UpdateDetails" method="post">
<center><table>
<tr>
<td>First Name</td><td><input type="text" value ="<%=infoGot.get(0).toString()%>" name="firstname"  readonly="readonly" id = "firstname"></td>
</tr>
<tr>
<td>Last Name</td><td><input type="text" value ="<%=infoGot.get(1).toString()%>" name= "lastname" readonly="readonly" id="lastname"></td>
</tr>
<tr>
<td>Date Of Birth</td><td><input type="date" name="dateofbirth" value ="<%=infoGot.get(2).toString()%>" readonly="readonly" id = "dateofbirth"></td>
</tr>
<tr>
<td>Email Adderss</td><td><input type="text" name="emailaddress" value ="<%=infoGot.get(3).toString()%>" readonly="readonly" id = "emailaddress"> </td>
</tr>
<tr>
<td>Phone Number</td><td><input type="text" name="phonenumber" value ="<%=infoGot.get(4).toString()%>" readonly="readonly" id = "phonenumber"></td> 
</tr>
<tr>
<td>Address</td><td><input type="text" name="address" value ="<%=infoGot.get(5).toString()%>" readonly="readonly" id = "address"> </td>
</tr>
<tr>
<td>Password</td><td><input type="text" name="pw" value ="<%=infoGot.get(6).toString()%>" readonly="readonly" id = "pw"></td>
</tr>
</table><br></br>
<input type="button" value="Edit" onclick="makeEdit()">
<input type="submit" value="Update"> <p id="updateinfo"> </p>
 

</form>

<script type="text/javascript">

function makeEdit()
{
	
	document.getElementById("firstname").removeAttribute('readonly');
	document.getElementById("lastname").removeAttribute('readonly');
	document.getElementById("dateofbirth").removeAttribute('readonly');
	document.getElementById("phonenumber").removeAttribute('readonly');
	document.getElementById("address").removeAttribute('readonly');
	document.getElementById("pw").removeAttribute('readonly');

}

</script>



</center>
</body>
</html>