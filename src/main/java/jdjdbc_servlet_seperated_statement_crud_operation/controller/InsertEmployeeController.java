package jdjdbc_servlet_seperated_statement_crud_operation.controller;

import java.time.LocalDate;

import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class InsertEmployeeController {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		
		Employe employe=new Employe();
		
		employe.setId(3344);
		employe.setName("Praveen");
		employe.setEmail("praveen@gmail.com");
		employe.setPassword("123huh");
		employe.setPhone(566752425);
		employe.setDob(LocalDate.parse("2003-10-10"));
		employe.setDoj(LocalDate.parse("2026-10-10"));
	
		Employe employe2=dao.saveEmployee(employe);
		String msg=employe2!=null?"data inserted":"something went wrong";
		System.out.println(msg);
	}
}
