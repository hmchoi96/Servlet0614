<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>오늘부터 1일</h2>
	
	<%
	
		Calendar today = Calendar.getInstance();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일");
		String dateString = formatter.format(today.getTime());
		
	
		int dateCount = 100;
		for(int i = 1; i <= 10; i ++) {
			dateCount = dateCount * i;
			today.add(Calendar.DATE, dateCount);
			out.println(dateCount + "일: " + dateString);
		}
		
		
		/*
		<
		for(int i = 1; i <= 10; i ++) {
			today.add(Calendar.DATE, 100);
			String dateString = formatter.format(today.getTime());
		>	
			<div class= "display-4"> <100*i>일 : <span class = "text-danger">
		
		<}>
		
		
		*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	%>















</body>
</html>