package org.java.javaapi;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.Date;

class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;

		try {
			// 예외( 자바 애플리케이션 실행 중 무시할 정도의 에러 -> Exception
			// 예외 처리 -> 프로그램을 정상 실행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("java.util.Date"); //
		} catch (ClassNotFoundException e) {
			System.out.println("예외 처리 -> ClassNotFoundException ");
			e.printStackTrace();
		} finally {
			System.out.println("에외에 상관없이 처리");
		}

		System.out.println("정상 실행 -> ");

		return null;
	}
}

public class BasicClassEx {
	public static void main(String[] args) {
		
		System.out.println("Class.forName");
		
		DBConnect.getConnection();
		
		System.out.print("print");
		System.out.print("출력 -> 줄바꿈 X \t (tab) \n");
		System.out.print("출력 -> 줄바꿈 X (줄바꿈-계행) \n");

		System.out.println("println");
		System.out.print("출력 -> 줄바꿈 O");
		System.out.println(LocalDateTime.now());
		System.out.println(new Date());
		System.out.println(new int[] { 1, 2, 3, 4, 5 });

		System.out.println("printf");
		System.out.printf("나이 %d, 이름 %s", 10, "김이름");
		System.out.printf("실수 %.3f", 15.432);
		System.out.println("print in");

	}
}
