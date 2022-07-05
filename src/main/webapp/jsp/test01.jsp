<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01</title>
</head>
<body>


<%-- 01 --%>
	<% 
	int[] scores = {80, 90, 100, 95, 80};
	
	int avgs = 0;
	for(int i=0;i<5;i++) {
		avgs += scores[i];
		}
	avgs= avgs / 5;
	%>
	<h4><%= avgs %></h4>

<%-- 02 --%>
	<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int score = 0;
	for(String count : scoreList) {
		if(count.equals("O")) {
			score ++;
		}
	}
	score = score * 10;
	%>

	<%=score %>
	
<%-- 03 --%>

	<%!
	public int getSum(int k) {
		int sum = 0;
		for(int i = 1; i <= k; i ++) {
			sum+=i ;
		}
		return sum;
	}
	%>


	<%= getSum(50) %>

<%-- 04 --%>
	
	<%
	String birthDay = "20010820";
	String yearString = birthDay.substring(0,4);
	int year = Integer.parseInt(yearString);
	year = 2022- year +1;
	
	%>

	<%= year %>






</body>
</html>