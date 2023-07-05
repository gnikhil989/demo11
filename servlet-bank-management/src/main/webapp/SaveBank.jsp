
<%@page import="com.jsp.dto.Bank"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.BankService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
BankService bankService= new BankService();
	%>
	<%
	List<Bank> banks= bankService.getAllBanks();%>
	<table border="2px">
		<tr>
			<th>Bank_ID</th>
			<th>Bank_NAME</th>
			<th>Bank_City</th>
		</tr>
		<%
		for (Bank b : banks) {
			if(b.getBank_name()!=null){
		%>
		


		<tr>
			<td><%=b.getId()%></td>
			<td><%= b.getBank_name()%></td>
			<td><%=b.getCity() %></td>

		</tr>
		<%
		} }
		%>
	</table> <br> <br>
	<h3>If your desired bank is not present then please enter the desired bank details</h3>
	<form action="SaveBank" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Enter your Bank Name</label> <input
				type="text" class="form-control" name="BankName"
				aria-describedby="emailHelp" placeholder="Enter Bank Name"><br>
			<br>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">City : </label> <input type="text"
				class="form-control" name="City" placeholder="City"><br>
			<br>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<form action="BankController" method="post">
		Login as a Customer :<input type="submit" name="Customer" placeholder="Click me if you are a Customer"><br> <br>
		
		Login as a Manager :<input type="submit" name="Manager" placeholder="Click me if you are a Manager"> <br> <br>

	</form>
</body>
</html>