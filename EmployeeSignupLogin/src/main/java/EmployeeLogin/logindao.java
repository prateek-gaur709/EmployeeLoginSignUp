package EmployeeLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logindao {
	String url="jdbc:mysql://localhost:3306/EmployeeDetail";
	String sqlusername="root";
	String sqlpass="root";
	String query="select * from Prateek_111915093_detail where username=? and password=?";
	public boolean check(String uname,String pass) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,sqlusername,sqlpass);
	
		PreparedStatement st=con.prepareStatement(query);

		st.setString(1, uname);
		st.setString(2, pass);

		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}
}
