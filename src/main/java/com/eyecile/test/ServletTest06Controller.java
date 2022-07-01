package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String numberString1 = request.getParameter("number1");
		String numberString2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		int addition = number1 + number2;
		int substraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// 형태 잡기
		// {"addition":1524, "substraction":270, "multiplication":21524 , "division":55}
		// 제이슨은 데이터를 리스펀스에 담아서 전달을 하되, html과 같은 화면을 꾸미는게 아니라, 순수하게 데이터만 전달할때 쓰는 포멧임
		out.println("{\"addition\":" + addition + ", \"substraction\":" + substraction + ", \"multiplication\":" + multiplication +  ", \"division\":" + division + "}");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
