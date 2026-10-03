package jdjdbc_servlet_seperated_statement_crud_operation.controller;

import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;

public class DeleteEmployeeByIdController {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		boolean result=dao.deleteEmployeeByIdDao(200);
		String msg=result?"deleted":"something went wrong";
		System.out.println(msg);
		
	}

}
