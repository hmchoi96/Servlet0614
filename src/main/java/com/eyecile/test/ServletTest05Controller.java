package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class ServletTest05Controller extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>구구단</title></head><body>");
		
		//파라미터는 무조건 문자로 저장됨
		String numberString = request.getParameter("number");
		int number = Integer.parseInt(numberString);
		out.println("<ul>");
		for(int i = 1; i <= 9; i ++) {
			out.print("<li>" + number + " X " + i + " = " + (number * i) + "</li>");
		}
		out.print("</ul>");
		out.print("</body></html>");
		
	}
	
	
	
}
