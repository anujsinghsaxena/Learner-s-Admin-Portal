<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddTeacher">
<table border=5 align=center>
			<tr align=center><td colspan=2>Personal Details<td></td>
			
			 <tr>
            <td> Tno</td>
            <td><input type="text" id="tno" name="tno" required="required"></td>
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
           	<td>subject</td>
            <td><input type="text" id="subject" name="subject" required="required" ></td>
            </tr>
            <tr>
            
            
           	<td>class</td>
            <td><input type="number" id="sclass" name="sclass" required="required" ></td>
            </tr>
             
           
            <tr align=center><td colspan=2>
            
            <input  type=submit value=add  name=submit /></td></tr>
            </table>
 </form>
 <br><br>
<div align=center>
<a href="adminpage.jsp">
		   <input type="button" value="go back to adminpage" />
		</a> </div>
</body>
</html>