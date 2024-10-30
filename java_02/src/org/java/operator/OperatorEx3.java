package org.java.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		System.out.println("비교연산자, 조건문");
		
		// 아이디, 비밀번호를 입력받아서 DB에 저장되어 있는 데이터와 일치하면 "로그인 성공, 즐거움 쇼핑되세요!" 일치하지 않으면 "회원정보가 틀립니다! 다시 로그인 해주세요!"를 콘솔에 표시하는 프로그래밍 
		//아이디, 비밀번호 -> 문자열, 적절한 매서드, next()...
		// 조건문 if문을 이용
		Scanner scn = new Scanner(System.in);
		
		String dbId="m1111";
		String dbPw="1234";
		
		System.out.print("ID :");
		String id = scn.next();
		System.out.print("PW :");
		String pw = scn.next();
		
//		// 아이디 비밀번호 동시에 true일 경우에만 실행
//		if (dbId.equals(id) && dbPw.equals(pw)) {
//			System.out.println("로그인 성공, 즐거움 쇼핑되세요!");
//		}else {
//			System.out.println("회원정보가 틀립니다! 다시 로그인 해주세요!");
//		}
		
		// 아이디 비밀번호 동시에 true일 경우에만 실행
//		if (!dbId.equals(id) || !dbPw.equals(pw)) {
//			System.out.println("로그인 성공, 즐거움 쇼핑되세요!");
//		}else {
//			System.out.println("회원정보가 틀립니다! 다시 로그인 해주세요!");
//		}
		
		if (dbId.equals(id)) {
			if (dbPw.equals(pw)) {
				System.out.println("로그인 성공, 즐거움 쇼핑되세요!");
			}else {
				System.out.println("비밀번호가 틀립니다! 다시 로그인 해주세요!");
			}
			
		}else
		{
			System.out.println("아이디가 틀립니다! 다시 로그인 해주세요!");
		}
		scn.close();
	}
}
