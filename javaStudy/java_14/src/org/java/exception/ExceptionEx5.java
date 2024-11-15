package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println("Exception");

		int num1 = 10;
		int[] arrInt = new int[5];

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("나누는 수를 입력: ");
			int num2 = sc.nextInt();

			System.out.println(num1 / num2);
			System.out.println(Integer.toString(num2));
			System.out.println(arrInt[5]);
			System.out.println("OK");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눔");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("입력타입 에러");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		System.out.println("예외 상관 없음");
		sc.close();
	}
}