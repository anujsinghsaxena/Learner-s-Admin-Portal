<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddSubject">
<table border=5 align=center>
			<tr align=center><td colspan=2>Personal Details</td></tr>
			
			 <tr>
            <td> Sno</td>
            <td><input type="text" id="sno" name="sno" required="required"></td>
           </tr>
           
			<tr>
			<td>Subject</td>
            <td><input type="text" id="subject" name="subject" required="required"></td>
            </tr>
            
             
           
            <tr align=center><td colspan=2>
            <input  type=submit value=add  name=submit /></td></tr>
            </table>
 </form>
</body>
</html>