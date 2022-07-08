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
	/* String weightString = request.getParameter("weight");
	String heightString = request.getParameter("height");
	
	int weight = Integer.parseInt("weightString");
	int height = Integer.parseInt("heightString"); */
	
	double height = Integer.parseInt(request.getParameter("height")) / 100.0;
	int weight = Integer.parseInt(request.getParameter("weight"));
	%>
	
	<%!
	public double getBmi(int w, double h) {
		double bmi =  w / ((h / 1.0) * (h / 1.0));
		return bmi;
	}
	public String getResult(double bmi) {
		String result="";
		if(bmi <= 20) {
			result = "저체중";
		}else if(bmi > 20 && bmi <= 25) {
			result = "정상";
		}else if(bmi > 25 && bmi <= 30) {
			result = "과체중";
		}else {
			result = "비만";
		}
		
		return result;
	}
	%>
	
	<%
	double bmi = getBmi(weight, height);
	String result = getResult(bmi);
	%>
	
	<h3>BMI 측정 결과</h3> <br>
	<h2>당신은 <%= result %> 입니다!</h2>
	<h4>BMI 수치 : <%= bmi %></h4>
	
	
	
	
	
</body>
</html>