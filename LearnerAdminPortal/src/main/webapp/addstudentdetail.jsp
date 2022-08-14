<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student Details</title>
</head>
<body>
<form action="AddStudent">
<table border=5 align=center style="border-color: blue;border-style: double;">
			<tr align=center><td colspan=2>Personal Details<td></td>
			
			 <tr>
            <td> Rno</td>
            <td><input type="text" id="cname" name="rno" required="required"></td>
           </tr>
           
			<tr>
			<td>First Name</td>
            <td><input type="text" id="fname" name="fname" required="required"></td>
            </tr>
            
            <tr>
            <td> last name</td>
            <td><input type="text" id="lname" name="lname" required="required"></td>
           </tr>
            
            <tr>
           	<td>class</td>
            <td><input type="number" id="city" name="sclass" required="required" ></td>
            </tr>
             
           
            <tr align=center><td colspan=2>
            <input  type=submit value=add  name=submit /></td></tr>
            </table>
 </form>
</body>
</html>