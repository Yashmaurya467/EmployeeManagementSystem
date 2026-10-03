<%@page import="jdjdbc_servlet_seperated_statement_crud_operation.dto.Employe"%>
<%@page import="jdjdbc_servlet_seperated_statement_crud_operation.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update-Page</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, Helvetica, sans-serif;
}

/* Background */
body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background: linear-gradient(135deg,#667eea,#764ba2);
}

/* Form Card */
.container{
    background:white;
    padding:40px;
    border-radius:10px;
    width:100%;
    max-width:420px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

/* Title */
.container h2{
    text-align:center;
    margin-bottom:20px;
    color:#333;
}

/* Labels */
label{
    font-weight:bold;
    color:#444;
    font-size:14px;
}

/* Inputs */
input{
    width:100%;
    padding:10px;
    margin:6px 0 15px 0;
    border-radius:5px;
    border:1px solid #ccc;
    transition:0.3s;
}

/* Input Focus */
input:focus{
    border-color:#667eea;
    outline:none;
    box-shadow:0 0 5px rgba(102,126,234,0.5);
}

/* Button */
button{
    width:100%;
    padding:12px;
    border:none;
    border-radius:5px;
    background: linear-gradient(135deg,#667eea,#764ba2);
    color:white;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

/* Button Hover */
button:hover{
    opacity:0.9;
}

/* Responsive */
@media(max-width:480px){
    .container{
        padding:25px;
    }
}

</style>

</head>

<body>

<%
int id=Integer.parseInt(request.getParameter("id"));
Employe employe=new EmployeeDao().getEmployeById(id);

%>

<div class="container">

<h2>Update-Employee-Details</h2>

<form action="employeeRegister">

<label>EMPLOYEE ID</label>
<input type="number" value="<%=employe.getId() %>" name="id">

<label>EMPLOYEE NAME</label>
<input type="text" value="<%=employe.getName() %>" name="name">

<label>EMPLOYEE EMAIL</label>
<input type="email" value="<%=employe.getEmail() %>" name="email">

<label>EMPLOYEE PASSWORD</label>
<input type="password" value="<%=employe.getPassword() %>" name="psw">

<label>EMPLOYEE PHONE</label>
<input type="tel" value="<%=employe.getPhone() %>" name="phone">

<label>EMPLOYEE DOJ</label>
<input type="date" name="doj" value="<%=employe.getDoj() %>">

<label>EMPLOYEE DOB</label>
<input type="date" name="dob" value="<%=employe.getDob() %>">

<button type="submit">Update</button>

</form>

</div>

</body>
</html>