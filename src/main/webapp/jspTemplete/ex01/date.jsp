<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>


<%
	Date now = new Date(); //날짜만 불러옴
	SimpleDateFormat formatter = new SimpleDateFormat("hh시 mm분 ss초");
	
	String dateString = formatter.format(now);
	
%>
<div><%= dateString %></div>