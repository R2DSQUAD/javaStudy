package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("Exception");
//		1. 정상적으로 프로그램을 싱행
//		2. 예외를 미리 예상

		int num1 = 100;

		Scanner sc = new Scanner(System.in);

		System.out.println("나눈 수: ");

		int num2 = sc.nextInt();
		
		try {
			double num3 =  num1 / num2;
			System.out.println(num3);
		}catch (ArithmeticException e) {
			//예외처리
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			//외부 연결, DB -> SQL 실행 후
			System.out.println("에외 사관 없이 실행");
		}

		
		
		System.out.println("프로그램 정상 실행");
		sc.close();
	}
}
