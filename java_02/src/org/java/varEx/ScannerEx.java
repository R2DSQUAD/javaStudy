package org.java.varEx;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("Scanner");
		//개발자가 직접 입력
		Scanner scn1 = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		System.out.print("이름 입력: ");
//		String name = scn1.next();
//		System.out.println("입력 이름: " + name);
//		
//		System.out.print("나이 입력: ");
//		int age = scn1.nextInt();
//		System.out.println("입력 나이: "+ age);
//		
//		System.out.print("키 입력: ");
//		double height = scn1.nextFloat();
//		System.out.println("입력 키: "+ height);
		
		
		System.out.print("이름: ");
		String name =scn1.next();
		System.out.print("나이: ");
		int age = scn1.nextInt();
		System.out.print("키: ");
		double height = scn1.nextFloat();
		
		System.out.println("입력 정보: 이름: "+ name + ", 나이: "+ age + ", 키"+ height + " 입니다.");
		scn1.close();
	}
}
