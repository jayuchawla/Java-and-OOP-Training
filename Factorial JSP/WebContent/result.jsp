<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="FactorialServlets" method="post">
			<label>Enter Number</label>
			<input type="number" name="num">
			<input type="submit">	
		</form>
	</div>
</body>
</html>

<%
	Long res = (Long)request.getAttribute("result");
	out.println("Result: " + res);
%>