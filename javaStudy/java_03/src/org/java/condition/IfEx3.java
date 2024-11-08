package org.java.condition;

public class IfEx3 {
	public static void main(String[] args) {
		System.out.println("if -> 조건 2개 이상");
		
		//eDB 제약 조건 위반 -> 무결성 위반
		//spring 예외 발생 -> Excetpion 발생 -> 처리
		int grade =90;
		if(grade>=0 && grade<=100) {
			if(grade <= 90) {
				System.out.println("A");
			}else if(grade <= 80) {
				System.out.println("B");
			}else if(grade <= 70) {
				System.out.println("C");
			}else if(grade <= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("제약조건 위반입니다. 0~100의 숫자만 입력하세요");
		}
	}
}
