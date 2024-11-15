package org.java.exception;

import java.util.Scanner;

class A {
	void m1() {
		//회원가입, 이메일은 중복 불가능, DB저장되어 있으면 예외 발생
		//DB에 이메일 존재하지 않으면 회원가입을 진행
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력: ");
		
		String userEmail=sc.next();
		
		String dbUserEmail="m1@email.com";
		
		if(userEmail.equals(dbUserEmail)) {
			throw new IllegalArgumentException("이메일(회원)이 이미 존재합니다");
		}else {
			System.out.println("회원가입 실행");
		}
		
	}
}

public class ExceptionEx8 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		A a1 = new A();
		
		try {
			a1.m1();
		}catch(IllegalArgumentException e) {
			System.out.println("예외 메세지 -> "+ e.getMessage());
		}finally {
			System.out.println("기본 실행");
		}
		
		System.out.println("정상 실행");
	}
}
