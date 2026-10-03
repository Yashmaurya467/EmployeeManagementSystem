package jdjdbc_servlet_seperated_statement_crud_operation.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class GetMultipleEmployee {

	public static void main(String[] args) {
		Employe e1=new Employe();
		
		e1.setId(303);
		e1.setName("Yash");
		e1.setEmail("yash@gmail.com");
		e1.setPassword("37878");
		e1.setPhone(788980087);
		e1.setDob(LocalDate.parse("2000-08-01"));
		e1.setDoj(LocalDate.parse("2026-01-01"));
	
		Employe e2=new Employe();
		e2.setId(304);
		e2.setName("Rishi");
		e2.setEmail("rishi@gmail.com");
		e2.setPassword("37878ee");
		e2.setPhone(78811087);
		e2.setDob(LocalDate.parse("2005-08-01"));
		e2.setDoj(LocalDate.parse("2030-01-01"));
		
		List <Employe> emp=new ArrayList<Employe>();
		emp.add(e1);
		emp.add(e2);
		
		EmployeeDao dao=new EmployeeDao();
		dao.saveMultipleEmployeeDao(emp);
	}
	
	


}
