package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class ServletTest07Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String paymentcard = request.getParameter("card");
		String priceString = request.getParameter("price");
		int price = Integer.parseInt(priceString);
		
		String printingwords = "";
		
		if(paymentcard.equals("신한카드")) {
			printingwords = "결제 불가 카드입니다.";
		} else if(address.contains("서울시")) {
			printingwords = address + " 배달 준비중";
		}else {
			printingwords = "배달불가 지역입니다.";
		};
		
		// or
//		if(!address.contains("서울시")) {
//			printingwords = "배달불가 지역입니다.";
//		}else if(paymentcard.equals("신한카드")) {
//			printingwords = "결제 불가 카드입니다.";
//		}else {
//			printingwords = address + " 배달 준비중";
//		}
		
		out.println("<html><head><title>주문하기</title></head>");
		out.println("<body>");
		out.println("<h2>" + printingwords + "</h2><hr>결제금액 : " + price);
		out.println("</body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
