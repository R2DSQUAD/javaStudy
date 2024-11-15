package org.java.exception;

import java.util.Scanner;

public class ExeceptionEx4 {
	public static void main(String[] args) {
		System.out.println("Exception");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("나이 입력:");
			String age = sc.next();
			System.out.println(Integer.parseInt(age));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("기본 실행");
		}
		
		sc.close();
		
		System.out.println("프로그램 정상 실행");
	}
}
