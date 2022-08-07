package com.eyecile.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Mysql 접속 과정을 간결하게 해준다
public class MysqlService {
	
	//static 을 붙여서, 객체생성 없이도 사용할수 있는 변수
	private static MysqlService mysqlService = null;
	

	//접속 정보, url, userId, password
	//final -> 앞으로 어떤 형태로든 수정될수 없다
	private final String url = "jdbc:mysql://localhost:3306/SQL0530";
	private final String userId = "root";
	private final String password = "root";
	
	Connection connection;
	Statement statement;
	
	// 객체를 전달하는 기능 (instance = 객체의 다른말)
	// 객체 생성 없이 호출 가능한 메소드
	public static MysqlService getInstance() {
		if(mysqlService == null) {
			mysqlService = new MysqlService();
		}
		return mysqlService;
	}
	
	
	
	//접속 기능
	public void connect() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			this.connection = DriverManager.getConnection(url, userId, password);
			this.statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//쿼리 수행기능
	//insert update delete
	public int update(String query) {
		try {
			int count = this.statement.executeUpdate(query);
			return count;
		}  catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}

	// select 쿼리 수행 기능
	public ResultSet select(String query) {
		ResultSet resultSet;
		try {
			resultSet = this.statement.executeQuery(query);
			return resultSet;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
			
		}
	}

	
	
	
	
	
	
	
	
	
	
}
