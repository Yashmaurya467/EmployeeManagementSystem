package jdjdbc_servlet_seperated_statement_crud_operation.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class LoginEmployeeController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		System.out.println("email ="+email +" "+"password ="+password);
		
		EmployeeDao dao=new EmployeeDao();
		Employe emp=dao.getEmployeByEmailDao(email);
		PrintWriter printWriter=resp.getWriter();
		
		if(emp!=null) {
			if(emp.getPassword().equals(password)) {
				System.out.println("login success");
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			}
			else {
				System.out.println("check your password");
				printWriter.write("<html><body><h4 style='color:red;'>Given Password is Incorrect</h4></body></html>");
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
			}
		}
		else {
			System.out.println("somethimg went wrong");
			printWriter.write("<html><body><h4 style='color:red;'>Given Email is Incorrect</h4></body></html>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}
	

}
