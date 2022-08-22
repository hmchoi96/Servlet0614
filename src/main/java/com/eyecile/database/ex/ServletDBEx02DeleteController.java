package com.eyecile.database.ex;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eyecile.common.MysqlService;

@WebServlet("/db/ex02/delete")
public class ServletDBEx02DeleteController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
	// 어차피 딜리트 하고 나서 보여줄 페이지 없기때문에 send-redirect 를 통해서 리스트 화면으로 이동시킬거임 - response type/ content type 필요 없음
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		
		String id = request.getParameter("id");
		
		String query = "delete from `new_user` where `id` = "+id+";";
		
		mysqlService.update(query);
		
		try {
			response.sendRedirect("/db/ex02.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
