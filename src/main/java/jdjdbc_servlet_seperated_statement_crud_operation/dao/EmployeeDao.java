package jdjdbc_servlet_seperated_statement_crud_operation.dao;

import java.util.ArrayList;
import java.util.List;
import java.nio.channels.Pipe.SourceChannel;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import jdjdbc_servlet_seperated_statement_crud_operation.connection.CreateConnection;
import jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe;


public class EmployeeDao {
	
	
	Connection connection=CreateConnection.createJdbcConnection();
	
	public Employe saveEmployee(Employe employe) {
		
		String insertQuery="insert into employee(id,name,email,password,phone,dob,doj) values (?,?,?,?,?,?,?)";
		
		
		try {
			PreparedStatement ps=connection.prepareStatement(insertQuery);
			ps.setInt(1, employe.getId());
			ps.setString(2, employe.getName());
			ps.setString(3, employe.getEmail());
			ps.setString(4, employe.getPassword());
			ps.setLong(5, employe.getPhone());
			ps.setObject(6, employe.getDob());
			ps.setObject(7, employe.getDoj());
			
			int a=ps.executeUpdate();
			return a!=0?employe:null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public Employe getEmployeById (int id) {
		String displayEmployeById="select * from employee where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(displayEmployeById);
			ps.setInt(1, id);
			
			ResultSet resultSet=ps.executeQuery();
			if(resultSet.next()) {
				int id1=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String email=resultSet.getString("email");
				String password=resultSet.getString("password");
				long phone=resultSet.getLong("phone");
				LocalDate dob=resultSet.getDate("dob").toLocalDate();
				LocalDate doj=resultSet.getDate("doj").toLocalDate();
				
				Employe employe=new Employe();
				employe.setId(id1);
				employe.setName(name);
				employe.setEmail(email);
				employe.setPassword(password);
				employe.setPhone(phone);
				employe.setDob(dob);
				employe.setDoj(doj);
				
				return employe;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return null;
	}
	
	public Employe getEmployeByEmailDao(String employeEmail) {
		String displayEmploye="select * from employee where email=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(displayEmploye);
			ps.setString(1, employeEmail);
			
			ResultSet resultSet=ps.executeQuery();
			if(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String email=resultSet.getString("email");
				String password=resultSet.getString("password");
				long phone=resultSet.getLong("phone");
				LocalDate dob=resultSet.getDate("dob").toLocalDate();
				LocalDate doj=resultSet.getDate("doj").toLocalDate();
				
				Employe employe=new Employe();
				employe.setId(id);
				employe.setName(name);
				employe.setEmail(email);
				employe.setPassword(password);
				employe.setPhone(phone);
				employe.setDob(dob);
				employe.setDoj(doj);
				
				return employe;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return null;
}
	
	public boolean deleteEmployeeByIdDao(int id) {
		
		String deleteEmploye="delete from employee where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(deleteEmploye);
			ps.setInt(1, id);
			int a=ps.executeUpdate();
			return a!=0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean updateEmployeeNameById(String name,int id) {
		String updateEmploye="update employee set name=? where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(updateEmploye);
			ps.setString(1, name);
			ps.setInt(2, id);
			
			int a=ps.executeUpdate();
			return a!=0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public Employe displayEmployee(int id) {
		
	
		String displayEmp="select * from employee where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(displayEmp);
			ps.setInt(1, id);
			
			
			ResultSet resultSet=ps.executeQuery();
			
			if(resultSet.next()) {
				Employe employe=new Employe();
				int id1=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String password=resultSet.getString("password");
				String email=resultSet.getString("email");
				long phone=resultSet.getLong("phone");
				LocalDate dob=resultSet.getDate("dob").toLocalDate();
				LocalDate doj=resultSet.getDate("doj").toLocalDate();
				
				employe.setId(id1);
				employe.setName(name);
				employe.setEmail(email);
				employe.setPassword(password);
				employe.setPhone(phone);
				employe.setDob(dob);
				employe.setDoj(doj);
				
				return employe;
			}
			return null;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Employe> getAllEmployeDao(){
		String displayAllEmploye="select * from employee";
		
		try {
			PreparedStatement ps=connection.prepareStatement(displayAllEmploye);
			ResultSet resultSet=ps.executeQuery();
			List<Employe> employees=new ArrayList<>();
			
			while(resultSet.next()) {
				Employe employe=new Employe();
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String password=resultSet.getString("password");
				String email=resultSet.getString("email");
				Long phone=resultSet.getLong("phone");
				LocalDate dob=resultSet.getDate("dob").toLocalDate();
				LocalDate doj=resultSet.getDate("doj").toLocalDate();
				employe.setId(id);
				employe.setName(name);
				employe.setEmail(email);
				employe.setPassword(password);
				employe.setPhone(phone);
				employe.setDob(dob);
				employe.setDoj(doj);
				employees.add(employe);
			}
			
			return employees;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void saveMultipleEmployeeDao(List<Employe> employes) {
		
		String insertQuery="insert into employee (id,name,email,phone,password,dob,doj) values (?,?,?,?,?,?,?)";
		
		try {
			connection.setAutoCommit(false);
			PreparedStatement ps=connection.prepareStatement(insertQuery);
			for(Employe employe:employes) {
				ps.setInt(1, employe.getId());
				ps.setString(2, employe.getName());
				ps.setString(3, employe.getEmail());
				ps.setLong(4, employe.getPhone());
				ps.setString(5, employe.getPassword());
				ps.setObject(6, employe.getDob());
				ps.setObject(7, employe.getDoj());
				
				ps.addBatch();
			}
			
			int a[]=ps.executeBatch();
			connection.commit();
			System.out.println(a.length);
			
		} catch (SQLException e) {
			if(connection!=null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		e.printStackTrace();
			
			
		}
	}
	

}
