package org.java.loop;

import java.util.Scanner;

public class Quiz5 {
	
	public static void main(String[] args) {
		System.out.println("while -> quiz");
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.print("권한을 입력하세요 : ");
			String roleType = scn.next();
			
			switch(roleType) {
			case "ROLE_ADMIN":
				System.out.println("당신의 권한은 관리자 권한입니다.");
				break;
			case "ROLE_MANAGER":
				System.out.println("당신의 권한은 중간 관리자 권한입니다.");
				break;
			case "ROLE_MEMBER":
				System.out.println("당신의 권한은 일반회원 권한입니다.");
				break;
			case "exit":
				System.out.println("프로그램 종료");
				isTrue = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}scn.close();
	}
}
