<%@page import="com.bean.ClassBean"%>
<%@page import="java.util.List"%>
<%@page import="com.service.ClassService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="com.bean.ClassBean"%>
<%@page import="java.util.List"%>
<%@page import="com.service.ClassService"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center> CLASS LIST</h1>
<form action="DeleteClassList" method="get">
<table border=5 align=center style="border-color: blue;border-style: double;">
<tr><th>CLASS</th><th> select to delete</th></tr>
<%
ClassService ss = new ClassService();
List<ClassBean> list =ss.listclass();
for(ClassBean b:list){

%>
<tr><td><%= b.getClno() %></td>
<td><input type="radio" value="<%= b.getClno() %>" name="delete" required="required"/></td></tr>

<%} %>
		<tr>
		<td colspan=1>
		<a href="adminpage.jsp">
		   <input type="button" value="go back to adminpage" />
		</a>
		<a href="AddClassDetails.jsp">
		   <input type="button" value="add new class" />
		</a>
		</td>

		<td><input type="reset" value="reset" name="reset" />
		<input type="submit" value="delete" name="submit" /></td></tr>
</table>
</form>
</body>
</html>