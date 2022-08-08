package com.eyecile.database.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eyecile.common.MysqlService;

@WebServlet("/db/test01")
public class ServletDBTest01Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response.setContentType("text/plain");
		 PrintWriter out = response.getWriter();
		 
		 
		 MysqlService mysqlService = MysqlService.getInstance();
		 mysqlService.connect();
		 
		 //인서트쿼리
		 String insertQuery = "insert into `real_estate`\n"
		 		+ "(`realtorid`,`address`,`area`,`type`,`price`,`rentPrice`,`createdAt`,`updatedAt`)\n"
		 		+ "value\n"
		 		+ "(3,'헤라펠리스 101동 5305호','350','매매',1500000,null, now(), now());";
		 
		 int count = mysqlService.update(insertQuery);
		 out.println(count);
		 
		 // 셀렉트 쿼리
		 String selectQuery = "select `address`, `area`, `type` from `real_estate`\n"
		 		+ "order by `id` desc limit 10;";
		 
		 ResultSet resultSet = mysqlService.select(selectQuery);
		 
		 try {
			while(resultSet.next()) {
				 
				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");
				
				out.println("매물 주소 : " + address + " 면적 : " + area + " 타입 : " + type);

			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

	
	
}
