package org.java.operator;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println("비트 연산자 -> 퀴즈");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = scn.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = scn.nextInt();
		
		System.out.println("비트 연산자: ");
		String type = scn.next();
		
		if (type == "&" && type == "|" && type == "^") {
			if (type == "&") {
				System.out.println(Integer.toBinaryString(num1&num2));
			}
			if (type == "|") {
				System.out.println(Integer.toBinaryString(num1|num2));
			}
			if (type == "^") {
				System.out.println(Integer.toBinaryString(num1^num2));
			}
		}
		
		scn.close();
		
	}
}
