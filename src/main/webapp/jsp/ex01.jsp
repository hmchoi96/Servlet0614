<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 기초</title>
</head>
<body>

	<h2>jsp기초</h2>
	
	<!-- html 주석  / html주석들은 사용자가 볼수 있음-->
	<%-- jsp 주석  / jsp 주석은 안보임--%>
	
	<%-- 1부터 100까지의 합 구하고 보여주기 --%>
	<%
	int sum = 100;
	for(int i = 1; i <= 100; i ++) {
		sum += i;
	}
	
	// 자바 코드로 보여주기
	// out.println("<h3>"+sum+"</h3>");   - 좋지않음
	
	
	
	%>
	
	<h3>합계 :  <%= sum %></h3>
	
	
	
	<%-- 리스트 활용 하기 --%>
	
	<%
	// 동물 이름 리스트
	List<String> animalList = new ArrayList<>();
	animalList.add("dog");
	animalList.add("cat");
	animalList.add("tiger");
	
	%>
	
	<h4><%= animalList.get(0) %></h4>
	
	<input type="text" value="<%= animalList.get(2) %>">
	
	
	<%-- 선언문 --%>
	<%!
		public String getHelloWorld() {
		return "hello world!!";
	}
	
	%>
	
	<%= getHelloWorld() %>
	
	
	
	
	
	
	
	
	
	

</body>
</html>