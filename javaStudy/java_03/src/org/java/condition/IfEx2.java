package org.java.condition;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		System.out.println("if-> 조건 2개");
		
		String dbId = "m111";
		String dbPw = "1234";
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ID: ");
		String id = scn.next();
		System.out.println("PW: ");
		String pw = scn.next();
		
		//인증 (Authentication), 권한 (Authorization) 관리는 Spring Security에서 관리한다. 
		
		if (id.equals(dbId) && pw.equals(dbPw)) {
			System.out.println("즐거운 쇼핑되세요!!");
		}else {
			System.out.println("로그인 정보가 오류 입니다!, 다시 로그인 해주세요");
		}
		
		scn.close();
	}
}
