<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/anyname.tld" prefix="my"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="" method="get">
			<label>Enter Number</label> <input type="number" name="num">
			<input type="submit">
		</form>
	</div>
	<%!String i; %>
	<%i = request.getParameter("num");
		if(i==null){
			i = "1";
		}
	%>
	<my:Hello data="<%=i%>"></my:Hello>
</body>
</html>
