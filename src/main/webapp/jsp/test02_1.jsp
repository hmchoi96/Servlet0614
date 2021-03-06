<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 

</head>
<body>

	<%
		Date now = new Date();
		
		// 현재 날짜 출력
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일");
		String dateString = formatter.format(now);
		
		//현재 시간
		formatter = new SimpleDateFormat("HH시 mm분 ss초");
		String timeString = formatter.format(now);
		
		//오늘 날짜를 보여줄지 현재 시간을 보여줄지 파라미터 추가
		// req -> time  타임 보여주기 date 날짜 보여주기
		String req = request.getParameter("req");
		String result = "";
		
		if(req.equals("time")) {
			result = "현재 시간은 " + timeString + " 입니다.";
		} else {
			result = "오늘 날짜는 " + dateString + " 입니다.";
		}
		
		
		
	%>


	<div class="display-4"><%= result %></div>
	


</body>
</html>