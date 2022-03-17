package signup.controller;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signup.dao.Emplyeedao;
import signup.model.Employee;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Emplyeedao emplyeedao =new Emplyeedao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd=request.getRequestDispatcher("EmployeeRegister.jsp");
		rd.forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String contact=request.getParameter("contact");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		Employee employee=new Employee();
		employee.setFname(fname);
		employee.setLname(lname);
		employee.setDob(dob);
		employee.setContact(contact);
		employee.setUname(uname);
		employee.setPassword(password);
		
		try {
			Emplyeedao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
		
	}

}
