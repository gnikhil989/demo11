<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Approve" method="post">

Customer ID : <input type="number" name="CustomerId"  value="<%= request.getParameter("id")%>"> <br> <br>

Enter Manager Id : <input type="number"  name="ManagerId"><br> <br>

Approve :<input type="radio" name="Status" value="Approve"> 
<input type="submit">
</body>
</html>