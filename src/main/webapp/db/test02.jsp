<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.eyecile.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>favorites</title>
</head>
<body>
	
	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "select * from `favorites` order by `id` desc;";
		ResultSet resultSet = mysqlService.select(query);
	%>
	
	<table>
		<thead>
			<tr>
				<th>사이트</th>
				<th>사이트 주소</th>
				<th>삭제하기</th>
			</tr>
		</thead>
		
		<tbody>
			<%
				while(resultSet.next()) {
			%>
		
		<tr>
			<td><%= resultSet.getString("name") %></td> 
			<!-- target="_blank"  => 새 탭으로 열  -->
			<td><a target="_blank" href="<%= resultSet.getString("url") %>"><%= resultSet.getString("url") %></a></td>
			<td><a href="/db/test02/delete?id=<%= resultSet.getInt("id") %>">삭제하기</a></td>
		</tr>
		
			<% } %>
		</tbody>
	</table>

	<a href="/db/test02_2.jsp" class="btn">추가하기</a>


</body>
</html>