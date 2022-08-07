<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료구조 활용</title>
</head>
<body>

	<%
	
		//과일 이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		
		
		// html 같은거도 괄호를 안닫으면 반복시킬수 있다.
		for(String item : fruits) {
	%>
		<h2><%= item %></h2>
	

	<% } %>

	
	<!-- 응용하기 -->
	<table border="1">
	<% for(String item : fruits) { %>
		<tr>
			<td><%= item %></td>
		</tr>
	<% } %>
	
	
	
	</table>





















</body>
</html>