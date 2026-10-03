<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>

body{
    font-family: Arial, sans-serif;
    background: linear-gradient(120deg,#74ebd5,#9face6);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
    margin:0;
}

div{
    background:white;
    padding:35px;
    border-radius:10px;
    box-shadow:0 0 15px rgba(0,0,0,0.2);
    width:320px;
}

h2{
    text-align:center;
    margin-bottom:25px;
}

label{
    font-weight:bold;
    font-size:14px;
}

input{
    width:100%;
    padding:10px;
    margin-top:5px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:5px;
}

input:focus{
    outline:none;
    border-color:#6c8cff;
}

button{
    width:100%;
    padding:10px;
    border:none;
    border-radius:5px;
    background:#6c8cff;
    color:white;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

button:hover{
    background:#4f6de0;
}

</style>

</head>
<body>

<div>

<h2>Employee Login</h2>

<form action="loginEmployee" method="post">

<label>Employee Email</label>
<input type='email' name='email' placeholder='Enter email' required>

<label>Employee Password</label>
<input type='password' name='password' placeholder='Enter password' required>

<button type='submit'>Login</button>

</form>

</div>

</body>
</html>