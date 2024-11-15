package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionEx3 {
	public static void main(String[] args) {
		System.out.println("Exception");

		int num1 = 100;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("나눈 수: ");

			int num2=sc.nextInt();
			
			System.out.println(1);
			System.out.println(2);
			
			double num3 =  num1 / num2;
			
			System.out.println(3);
			System.out.println(num3);
			System.out.println(4);
		}catch (ArithmeticException e) {
			//예외처리
			System.out.println("0으로 나눔");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("타입에러");
			e.printStackTrace();
			
			
		}finally {
			//외부 연결, DB -> SQL 실행 후
			System.out.println("에외 사관 없이 실행");
		}

		
		
		System.out.println("프로그램 정상 실행");
		sc.close();
	}
}
