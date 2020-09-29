<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<div>
			<form action="CalculatorServlet" method="post">
			<label>Operation</label><br>
			<P><SELECT NAME="expression" style="width: 150px">
				<OPTION VALUE=1>ADD
				<OPTION VALUE=2>SUBTRACT
				<option VALUE=3>MULTIPLY
				<option VALUE=4>DIVIDE
			</SELECT></P>
			
			<P>First number:</P>
			<P><INPUT placeholder="Number 1" type = "number" NAME="num1" size=10 style="width: 150px"></P>
			<P>Second number:</P>
			<P><INPUT placeholder="Number 2" type = "number" name="num2" size=10 style="width: 150px"></P>
			<P><INPUT TYPE="SUBMIT" NAME="Submit" value="Evaluate" style="width: 150px; background-color: 'orange'"></P>	
		</form>
	</div>
	</center>
		
</body>
</html>

<%
	Double res = (Double)request.getAttribute("result");
	if(res!=null){
		out.println("<center>"+res+"</center>");	
	}
	
%>
