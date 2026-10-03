package jdjdbc_servlet_seperated_statement_crud_operation.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class RegisterEmployeeController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException , IOException {
		
		String id=request.getParameter("id");
		int originalId=Integer.parseInt(id);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long phone=Long.parseLong(request.getParameter("phone"));
		LocalDate dob=LocalDate.parse(request.getParameter("dob"));
		LocalDate doj=LocalDate.parse(request.getParameter("doj"));
		
		 Employe employe=new Employe();
		 
		 employe.setId(originalId);
		 employe.setName(name);
		 employe.setEmail(email);
		 employe.setPassword(password);
		 employe.setPhone(phone);
		 employe.setDob(dob);
		 employe.setDoj(doj);
		 
		 EmployeeDao dao=new EmployeeDao();
		 Employe emp=dao.saveEmployee(employe);
		 
		 PrintWriter printWriter=response.getWriter();
	 
		 if(emp!=null) {
			 printWriter.write("<html><body><h3 style='color:green;'>you are registerd</h3></body></html>");
			 System.out.println("data registerd");
		 }
		 
		 else {
			 printWriter.write("<html><body><h3 style='color:red;'>something went wrong</h3></body></html>");
			  System.out.println("something went wrong");
		 }
	}
	
}
