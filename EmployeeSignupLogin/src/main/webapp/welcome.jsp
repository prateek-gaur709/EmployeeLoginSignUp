<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome User!</h1><br>
		<h4>Here are your details...</h4>
		<%try {
		String url="jdbc:mysql://localhost:3306/mystudents";
		String sqlusername="root";
		String sqlpass="root";
		String query="select * from student where username=? ";
		
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,sqlusername,sqlpass);
	
		PreparedStatement st=con.prepareStatement(query);
		
		String uname=request.getParameter("user");

		st.setString(1, uname);
		

		ResultSet rs=st.executeQuery();
		
		
		%>

		<%
		while (rs.next()) {
		%>
		rs.getString(2);
		out.println(rs.getString(2));
		<% } %>
		
		<%
		rs.close();
		st.close();
		con.close();
		} 
		
		catch (Exception ex) {
		%>
		
		</font>
		<font size="+3" color="red"></b>
		
		<%
		out.println("Unable to connect to database.");
		}
		%>
		
	</body>
</html>