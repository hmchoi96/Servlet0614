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

@WebServlet("/db/test01")
public class ServletDBTest01Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		
		PrintWriter out = response.getWriter();
	
	
	String query = "insert into `real_estate`\n"
			+ "(`realtorid`,`address`,`area`,`type`,`price`,`rentPrice`,`createdAt`,`updatedAt`)\n"
			+ "value\n"
			+ "(3,'헤라펠리스 101동 5305호','350','매매',1500000,null, now(), now());";
	
	MysqlService mysqlService = MysqlService.getInstance();
	mysqlService.connect();
	
	String selectQuery = "select * from `real_estate`;" ;
	
	ResultSet resultSet = mysqlService.select(selectQuery);
	
	//* 출력 컬럼은 매물 주소, 면적, 타입 입니다.
	//* id 기준 내림차순으로 10개만 출력하세요.
	try {
		while(resultSet.next()) {
			String address = resultSet.getString("address");
			int area = resultSet.getInt("area");
			String type = resultSet.getString("type");
			int id = resultSet.getInt("id");
			
			if(id <= 10) {
				out.println("매물 주소 : " + address + " 면적 : " + area + " 타입 : " + type);

			}
			
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	}
	
}
