package org.java.connect;

import java.sql.Connection;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
			
		try {
			//JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			//드라이버가 없을 때 예외 발생
			System.out.println("Driver Fail");
			e.printStackTrace();
		}finally {
			System.out.println("예외 상관 없이 실행");
			//DB연동 후에 
		}
		
		System.out.println("정상 실행");
		
			
		return conn;
	}
}
