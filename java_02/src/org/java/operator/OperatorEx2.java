package org.java.operator;

import java.io.Console;

public class OperatorEx2 {
	public static void main(String[] args) {
		System.out.println("비교 연산자(>,>=,<,<=,==,!="); 
		//왼쪽 기준 boolean으로 결과 값 도출 -> 조건(제어)문 or 반복문에서 자주 사용
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		
		String s1 = new String("문자열1");
		String s2 = new String("문자열1");
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		System.out.println(s1==s2);
		
		//객체 타입만 비교
		System.out.println(s1.equals(s2));
		
		//equals의 반대 !
		System.out.println(!s1.equals(s2));
		
		System.out.println(!true);
		
		System.out.println("if문 + 비교연산자");
		//조건문 (if)
		
		//조건 1
		if(num1>num2) {
			System.out.println(num1);
		}
		if(num1<num2) System.out.println(num1);
		
		
		//조건 2
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		

	}
}
