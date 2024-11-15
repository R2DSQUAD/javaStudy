package org.java.exception;

import java.sql.SQLException;

public class ExceptionEx7 {
	public static void excute() throws SQLException {
		System.out.println("excute()");
	}
	
	public static void main(String[] args) {
		System.out.println("Exception");
		
		try {
			excute();
			System.out.println("예외 발생 X");

		} catch(SQLException e) {
			System.out.println("예외 발생 O");
			e.printStackTrace();
		} finally {
			System.out.println("기본실행");
		}
	}
}
