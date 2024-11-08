package org.java.loop;

import java.util.Scanner;

public class WhileFn3 {
	public static void main(String[] args) {
//		System.out.println("while");
//		
//		int i=0;
//		while(i<10) {
//			i++;
//			
//			System.out.println(i);
//		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("계산프로그램을 시작하시겠습니까? (Y/N)");
			String on = scn.next();
			switch (on) {
			case "y":
				while (isTrue) {
					System.out.println("숫자1 : ");
					int num1 = scn.nextInt();
					System.out.println("숫자2 : ");
					int num2 = scn.nextInt();
					System.out.println("연산자(+-*/): ");
					String oper = scn.next();

					// 연산자 로직
					switch (oper) {
					case "-":
						System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
						break;
					case "*":
						System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
						break;
					case "/":
						System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
						break;
					case "+":
						System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
						break;
					case "exit":
						System.out.println("종료합니다.");
						isTrue = false;
						break;
						
					default:
						System.out.println("연산자 입력 오류");
						break;
					}
				}
			case "n":
				System.out.println("while문 종료");
				isTrue = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}scn.close();

	}
}
