package jdjdbc_servlet_seperated_statement_crud_operation.controller;

import java.util.List;

import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class GetAllEmployeeController {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		List<Employe> employees=dao.getAllEmployeDao();
		for (Employe employe : employees) {
			System.out.println(employe);
		}
	}
}
