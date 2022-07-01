package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String date = formatter.format(now);
			
		
		out.println("<html><head><title>뉴스 기사 출력</title></head><body>");
		out.println("<h1>[단독] 고양이가 야옹</h1>");
		out.println("<hr>");
		out.println("기사 입력시간 : " + date);
		out.print("끝");
		out.print("</body></html>");

	}
	
	
	
}
