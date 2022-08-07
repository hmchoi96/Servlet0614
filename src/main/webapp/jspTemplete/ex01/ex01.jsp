<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정적 템플릿</title>
</head>
<body>
	<%-- 현재 시간을 알려주는 jsp 파일을 불러와서 보여준다 --%>
	<h1>현재 시간은?</h1>
	<%@ include file="date.jsp" %>
	<%-- 정적 방식은 불러온 파일에서 쓰인 메소드나 변수이름이 겹칠수 있고 그게 어느 파일에 있는지 알수 없기때문에 동적방식을 주로 쓴다 --%>
</body>
</html>