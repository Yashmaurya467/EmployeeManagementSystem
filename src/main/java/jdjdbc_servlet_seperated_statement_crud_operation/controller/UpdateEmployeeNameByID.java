package jdjdbc_servlet_seperated_statement_crud_operation.controller;

import java.util.Scanner;

import jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;

public class UpdateEmployeeNameByID {
	
	public static void main(String[] args) {
		Employe employe=new Employe();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=scanner.nextInt();
		
		System.out.println("Enter name that has to be updated");
		String name=scanner.next();
		
		EmployeeDao dao=new EmployeeDao();
		boolean result=dao.updateEmployeeNameById(name, id);
		
		if(result) {
			System.out.println("data is inserted");
			employe=dao.displayEmployee(id);
			System.out.println("updated data is");
			System.out.println(employe);
		}
		else {
			System.out.println("something went worng");
		}
		 
		 employe=dao.displayEmployee(id);
		System.out.println(employe);
	}

}
