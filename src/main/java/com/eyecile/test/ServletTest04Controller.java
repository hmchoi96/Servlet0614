package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class ServletTest04Controller extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.print("<html><head><title>반복 리스트</title></head><body>");
		out.print("<ul>");
		for(int i = 1; i <= 30; i ++) {
			out.print("<li>" + i + "번째 리스트</li>");
		}
		out.print("</ul>");
		out.print("</body></html>");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
