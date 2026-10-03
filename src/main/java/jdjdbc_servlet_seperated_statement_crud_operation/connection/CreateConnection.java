package jdjdbc_servlet_seperated_statement_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class CreateConnection
{

	public static Connection createJdbcConnection() {
	//step1 Register Driver
	try {
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	
	//step2 create Connection
	String url="jdbc:mysql://localhost:3306/jdbc-m17";
	String username="root";
	String password="root";
	
	return DriverManager.getConnection(url, username, password);
	}
	catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
		
	}
}
