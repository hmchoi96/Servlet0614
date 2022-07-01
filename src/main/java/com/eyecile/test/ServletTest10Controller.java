package com.eyecile.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet{
	
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String idcheck = userMap.get("id");
		String pwcheck = userMap.get("password");
		String namecheck = userMap.get("name");
		
		out.println("<html><head><title>개인정보 확인</title></head><body>");
		
		if(!id.equals(idcheck)) {
			out.println("id가 일치하지 않습니다.");
		}else if(!pw.equals(pwcheck)) {
			out.println("password가 일치하지 않습니다.");
		}else {
			out.println(namecheck + "님 환영합니다.");
		}
	
		out.println("</body></html>");
		
		
		
//		//맵의 전체 데이터 확인하기
//		Set<String> keys = userMap.keySet();
		
//		for(String key : keys) {
//			if(key == id) {
//				
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
