<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee-Registration-Page</title>

<style>

body{
    font-family: Arial, sans-serif;
    background: linear-gradient(120deg,#89f7fe,#66a6ff);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

div{
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 15px rgba(0,0,0,0.2);
    width:350px;
}

h2{
    text-align:center;
    margin-bottom:20px;
}

label{
    font-weight:bold;
    font-size:14px;
}

input{
    width:100%;
    padding:8px;
    margin-top:5px;
    margin-bottom:15px;
    border-radius:5px;
    border:1px solid #ccc;
}

input:focus{
    border-color:#66a6ff;
    outline:none;
}

input[type="submit"]{
    background:#66a6ff;
    color:white;
    font-weight:bold;
    cursor:pointer;
    border:none;
    transition:0.3s;
}

input[type="submit"]:hover{
    background:#4b8df8;
}

</style>

</head>
<body>
<div>
<form action="employeeRegister" method='get'>
<label>EMPLOYEE-ID:</label> <br>
<input type='number' placeholder='enter employee id' name='id'> <br>

<label>EMPLOYEE-NAME:</label> <br>
<input type='text' placeholder='Enter Name' name='name'><br>

<label>EMPLOYEE-EMAIL:</label> <br>
<input type='text' placeholder='Enter Email' name='email'><br>

<label>EMPLOYEE-PASSWORD:</label> <br>
<input type='password' placeholder='Enter password' name='password'><br>

<label>EMPLOYEE-PHONE:</label> <br>
<input type='tel' placeholder='Enter Phone' name='phone'><br>

<label>EMPLOYEE-DOB:</label> <br>
<input type='date' placeholder='Enter dob' name='dob'><br>

<label>EMPLOYEE-DOJ:</label> <br>
<input type='date' placeholder='Enter doj' name='doj'><br>

<input type='submit' value='register'>
</form>
</div>

</body>
</html>