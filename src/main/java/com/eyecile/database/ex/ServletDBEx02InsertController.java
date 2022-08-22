package com.eyecile.database.ex;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eyecile.common.MysqlService;

@WebServlet("/db/ex02/insert")
public class ServletDBEx02InsertController extends HttpServlet {

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
//		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String introduce = request.getParameter("introduce");
		String email = request.getParameter("email");
		
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "insert into `new_user`\n"
				+ "(`name`,`yyyymmdd`,`introduce`,`email`,`createdAt`,`updatedAt`)\n"
				+ "value\n"
				+ "('" + name + "','" + yyyymmdd + "', '" + introduce + "', '" + email + "', now(), now());";
		
		
		int count = mysqlService.update(query);
		
		//이미 만들어놓은 파일로 보내면 되니 따로 출력할 필요 없음
//		out.println(count);
		
		// 페이지를 이동시킬수 있다. 
		response.sendRedirect("/db/ex02.jsp");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
