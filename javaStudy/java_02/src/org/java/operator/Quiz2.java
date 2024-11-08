package org.java.operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println("====계산기====");
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scn.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scn.nextInt();
		System.out.println("연산자 입력 예시 : +");
		System.out.println("연산자 입력 예시 : -");
		System.out.println("연산자 입력 예시 : *");
		System.out.println("연산자 입력 예시 : /");
		System.out.print("연산자 입력 : ");
		String oper = scn.next();
		
		if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
			if(oper.equals("+")) {
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			}
			if(oper.equals("-")) {
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			}
			if(oper.equals("*")) {
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			}
			if(oper.equals("/")) {
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			}
		}else {
			System.out.println("연산자 입력 오류");
		}
		
		scn.close();
	}
}
