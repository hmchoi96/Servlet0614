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
	int length = Integer.parseInt(request.getParameter("length"));
	
	//변환할 단위 여러개가 들어감 {inch, yard...}
	String[] units = request.getParameterValues("units");
	String result = "";
	for(int i = 0; i < units.length; i ++) {
		String unit = units[i];
		if(unit.equals("inch")) {
			double inch = length * 0.39 ;
			result = result + inch + "in<br>";
		}else if(unit.equals("yard")) { 
			double yard = length * 0.010936;
			result += yard + "yd<br>";
		}else if(unit.equals("feet")) {
			double feet = length * 0.0328084;
			result += feet + "ft<br>";
		}else {
			double meter = length / 100.0;
			result += meter + "m<br>";
		}
	}
	
	
	
	 %>

	<h2>변환 결과</h2>
	<h3><%= length %>cm</h3><hr>
	<h3><%=result %></h3><hr>
	
	
	
	
	
	
	


</body>
</html>