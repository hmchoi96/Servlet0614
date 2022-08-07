<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>
	
	<%
		Calendar today = Calendar.getInstance();
		out.println(today); 
		
		//simple date format
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String DateString = formatter.format(today.getTime());
		
		out.println(DateString + "<br>");
		
		//10일 후 날짜 확인 - 리턴이 아닌 해당 객체가 바뀜
		//today.add(Calendar.DATE, 10);
		//today.add(Calendar.DATE, -20); // 20일 전 날짜
		today.add(Calendar.MONTH, 25); // 25개월 후
		DateString = formatter.format(today.getTime());
		out.println(DateString);
		
		
		// 두 날짜 비교
		Calendar newCal = Calendar.getInstance();
		// 크다 작다
		//왼쪽의 객체가 오른쪽 객체보다 크면 1 을 더해줌
		//왼쪽의 객체가 오른쪽 객체보다 작으면 -1 / 같으면 0
		//
		int result = today.compareTo(newCal);
		
		if(result > 0) {
			out.println("today 가 더크다");
		}else if(result < 0) {
			out.println("newCal 이 더 크다");
		}else { 
			out.println("같다");}
		
			
			
			
			
			
			
			
			
			
		
	
	%>




</body>
</html>