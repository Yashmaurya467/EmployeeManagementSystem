package jdjdbc_servlet_seperated_statement_crud_operation.servlet.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;

@WebServlet(value = "/delete")
public class DeleteEmployeeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.deleteEmployeeByIdDao(id);
		
		if(b) {
			resp.sendRedirect("display.jsp");
			System.out.println("data deleted of id= "+id);
		}
		
	}
}
