package org.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		
		//DB-> 연결 객체
		Connection conn=null;
		
		//1. Driver
		String driver ="oracle.jdbc.driver.OracleDriver";	//Driver
		String url="jdbc:oracle:thin:@localhost:1521:xe"; 	//DB url
		String user="system";								//계정
		String password="1234";								//비밀번호
		
		//1. 드라이버 연결
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			
		//2. DB연동
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Fail");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 Fail");
			e.printStackTrace();
		}
		
		return conn;
	}
}
