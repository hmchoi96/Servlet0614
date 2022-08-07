<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		
		String operatorSt = request.getParameter("operator");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operator = "";
		double result = 0;
		if(operatorSt.equals("+")) {
			result = num1 + num2;
			operator = "+";
		}else if(operatorSt.equals("-")) {
			result = num1 - num2;
			operator = "-";
		}else if(operatorSt.equals("*")) {
			result = num1 * num2;
			operator = "*";
		}else {
			result = num1 / (double)num2;
			operator = "/";
		}
		
	%>
	
	<h2>계산 결과</h2>
	<h2><%= num1 %> <%= operator %> = <%=result %></h2>


















</body>
</html>