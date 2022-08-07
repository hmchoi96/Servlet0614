package com.eyecile.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eyecile.common.MysqlService;

@WebServlet("/db/ex01")
public class ServletDBEx01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");	
		
		PrintWriter out = response.getWriter();
		
		//DB 접속
//		try {
////			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			//접속 하기위해 필요한 정보들 - 서버 접속 주소, 아이디, 비번
//			String url = "jdbc:mysql://localhost:3306/SQL0530";
//			String userId = "root";
//			String password = "root";
//			
//			Connection connection = DriverManager.getConnection(url, userId, password);
//			Statement statement = connection.createStatement();
//			
			String query = "insert into `used_goods`\n"
					+ "(`sellerId`,`title`,`price`,`description`,`picture`,`createdAt`,`updatedAt`)\n"
					+ "value\n"
					+ "(3,'고양이간식 팝니다',10000,'고양이가 안먹어여 흐규ㅠ',null, now(),now());\n";
			
			// insert, update, delete 처리해주는 매소드
			// -> 실행(업데이트,삭제)된 행의 개수로 보여줌
//			int count = statement.executeUpdate(query);
			
			// -> singleton - 디자인 패턴
			// 무분별한 객체 생성을 통한 무분별한 db 접속을 막기위함
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String selectQuery = "select * from `used_goods`;\n" + "";
			
			ResultSet resultSet = mysqlService.select(selectQuery);
			
			//sql에서 제품 가져오기
			try { 
				while(resultSet.next()) {
					//resultSet 한테 컬럼이름 타이틀이란 문자열 가져오게 하기 
					String title = resultSet.getString("title");
					int price = resultSet.getInt("price");
					
					out.println("제품명 : " + title + " 가격 : " + price);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
//			int count = mysqlService.update(query);
			
//			out.println("삽입된 행의 개수: " + count);
			
			
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	
	
}
