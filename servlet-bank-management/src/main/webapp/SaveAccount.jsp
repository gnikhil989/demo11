<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the Customers Details</h1>
<form action="SaveAccount" method="post">
Enter your Bank id : <input type="number" name="id" placeholder="Enter your Bank id"> <br> <br>
Enter your Account Number :<input type="number" name="AccountNumber" placeholder="Enter your Account Numbrt"><br> <br>
Enter your Opening Balance :<input type="number" name="OpeningBalance" placeholder="Enter your Opening Balance"><br> <br>
<h3> Enter Type Account :</h3><br> <br>

Saving<input type="radio" name="Type" value="Saving"> 
Current <input type="radio" name="Type" value="Current">  <br><br>

<input type="submit" placeholder="click here to Submit">
</form>
</body>
</html>