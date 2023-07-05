<%@page import="com.jsp.dto.BankAccount"%>
<%@page import="com.jsp.service.BankAccountService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="GetAccount" method="post">
Enter Customer id : <input type="number" name="Customerid" placeholder="enter id"> <br> <br>
<input type="submit" placeholder="click here to get data">
</form>

</body>
</html>