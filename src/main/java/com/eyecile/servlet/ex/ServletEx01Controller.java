package com.eyecile.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ServletEx01Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 설정해줘야 하는것 - 내가만든 이 페이지는 어떤 형태의 문서다 라는걸 보여줘야함  컨텐트 타입
		
		// 기본적으로 붙어야하는 것 / 리스펀스 헤더
		// text/css - MIME 문서의 규격을 알려주는 문자열의 표준 
		response.setContentType("text/plain");
		// 캐릭터셋, 인코딩
		response.setCharacterEncoding("utf-8");
		
		// 현재 날짜와 시간을 보여주는 페이지
		Date now = new Date();
		
		//리스펀스 바디
		PrintWriter out = response.getWriter();
		out.println(now);
		
		// date 란 객체에 들어있는 날짜 정보를 내가 원하는 포멧으로 보여주게 하기 (month -> M / minutes -> m  , hh -> 12시간기준 /HH -> 24시간 기준)
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일 HH시 mm분 ss초");
		String dateString = formatter.format(now);
		out.println(dateString);
		
		
		
	}
	
}
