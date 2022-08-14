<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<form action="AdminLoginServlet" method=POST>
<table style="border-color: blue;border-style: double;">
<h1> LEARNER'S ACADEMY</h1>
<h2>Developer:- Anuj Singh Saxena</h2>
	<tr><th>login page</th></tr>
	<tr>
		<td>username
			<input type=text name=username required="required">
		</td>
	</tr>
	<tr>
		<td>password
			<input type=password name=password required="required">
		</td>
	
	</tr>
	<tr>
	<td>
		<input type=reset value=reset name=reset/>
		<input type=submit value=submit name=submit/>
	</td>
	</tr>
</table>
</form>
</body>
</html>