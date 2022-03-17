<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Employee Registration Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="fname" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lname" /></td>
    </tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" name="dob" /></td>
    </tr>
    <tr>
     <td>Contact Number</td>
     <td><input type="text" name="contact" /></td>
    </tr>
    <tr>
     <td>Username</td>
     <td><input type="text" name="uname" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>