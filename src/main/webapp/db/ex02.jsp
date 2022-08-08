<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.eyecile.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DateBase 조회</title>
</head>
<body>
	<%-- new_user 활용해서 테이블로 이쁘게 보여주기 --%>
	
	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "select * from `new_user`;";
		ResultSet resultSet = mysqlService.select(query);
		
	
	%>
	
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
			</tr>
		</thead>
		
		<tbody>
		<% while(resultSet.next()) { %>
		
			<tr>
				<td><%= resultSet.getString("name") %></td>
				<td><%= resultSet.getInt("yyyymmdd") %></td>
				<td><%= resultSet.getString("email") %></td>
			</tr>
			
		<% } %>
			
		</tbody>
	
	</table>
	
	
	
	
	
	
</body>
</html>