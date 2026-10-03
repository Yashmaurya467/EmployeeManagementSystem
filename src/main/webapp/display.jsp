
<%@page import="java.util.List"%>
<%@page import="jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao"%>
<%@page import="jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display-page</title>
</head>
<body>
		<h3>Display-Employee-Data</h3>
		
		<%List<Employe> employees=new EmployeeDao().getAllEmployeDao(); %>
		
		<table border="2">
			<tr>
				<th>ID:</th>
				<th>NAME:</th>
				<th>EMAIL:</th>
				<th>PHONE:</th>
				<th>DOB:</th>
				<th>DOJ:</th>
				<th colspan="2">ACTION:</th>
			</tr>
			
			<%for(Employe emp:employees) {%>
			
			<tr>
				<td><%=emp.getId() %></td>
				<td><%=emp.getName() %></td>
				<td><%=emp.getEmail()%></td>
				<td><%=emp.getPhone() %></td>
				<td><%=emp.getDob()%></td>
				<td><%=emp.getDoj()%></td>
				<td><a href="update.jsp?id=<%=emp.getId() %>">EDIT</a></td>
				<td><a href="delete?id=<%=emp.getId()%>">DELETE</a></td>
			</tr>
			
			
			<%} %>
			
		
		</table>
</body>
</html>
