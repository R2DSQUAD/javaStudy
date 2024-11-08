package org.java.oop;

import java.util.Scanner;

public class ClassBasic5Main {
	public static void main(String[] args) {
		ClassBasic5 c1 = new ClassBasic5();

		String rs1 = c1.toString();
		System.out.println(rs1);

		c1.num1 = 100;
		c1.num2 = 200;

		System.out.println(rs1);

		String rs2 = c1.toString();
		System.out.println(rs2);

		c1.m1();
		String op = c1.m2("/"); //호출(반환값 반환)
		System.out.println(op);
		System.out.println(c1.m2("+"));
		System.out.println(c1.m3(13, 15));
		System.out.println(c1.m4(12, 12, "+"));
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("첫번째 숫자 입력: ");
			int sum_1 = sc.nextInt();
			System.out.print("두번째 숫자 입력: ");
			int sum_2 = sc.nextInt();
			System.out.print("연산자 입력: ");
			String oper = sc.next();
			
			if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				System.out.println(c1.m4(sum_1,sum_2,oper));
			} else if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
			} else {
				System.out.println("+-*/이외의 연산자만 입력해주세요");
			}
		}
		sc.close();
		
		
		
		
	}
}
