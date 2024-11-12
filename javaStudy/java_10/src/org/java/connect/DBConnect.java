package org.java.connect;

import java.sql.Connection;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;

		try {
			// JDBC Driver 찾기
			Class.forName("oracle,jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Fail");
			e.printStackTrace();
		} finally {
			System.out.println("예외와 없이 실행");
		}
		System.out.println("정상 실행");
		return conn;
	}
}
