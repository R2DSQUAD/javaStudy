package org.java.connect;

import java.sql.Connection;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		
		//예외 -> 런타임 중 무시할 정도의 작은 에러 Exception
		// 예외 처리의 목적은 프로그램을 정상 실행, 예외 발생 시 중단 X
 		try {
			//클래스 여부
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
			e.printStackTrace();
		} finally {
			System.out.println("예외와 산관 없이 실행");
			// DB 연결 해제
		}
		
		return conn;
	}
}
