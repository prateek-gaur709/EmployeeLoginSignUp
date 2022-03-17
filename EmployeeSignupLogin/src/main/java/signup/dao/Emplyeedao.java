package signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import signup.model.Employee;

public class Emplyeedao {
	public static int registerEmployee(Employee employee) throws ClassNotFoundException {
        String query = "INSERT INTO Prateek_111915093_detail VALUES (?, ?, ?,?, ?, ?,?);";

        int result = 0;
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/EmployeeDetail", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, 9);
            st.setString(2, employee.getFname());
            st.setString(3, employee.getLname());
            st.setString(4, employee.getDob());
            st.setString(5, employee.getContact());
            st.setString(6, employee.getUname());
            st.setString(7, employee.getPassword());

            System.out.println(st);

            result = st.executeUpdate();

        } catch (Exception e) {
           e.printStackTrace();
        }
        return result;
	}
}
