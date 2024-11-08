package org.java.condition;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("if -> 조건1");
		//아이디 체크, 이메일 체크, 유효성 검사
		//조건이 true일 때만 명령문(구현부, 실행문)을 처리
		
		String email="m1@gmail.com"; //DB에 이메일이 등록 되어 있는 경우
		//회원가입 할 떄 -> 등록된 이메일이 있는지 확인
		//DB 테이블이 이메일 칼럼은 중복 불가능, NOT NULL의 contant가 설정 되어 있다.
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이메일 입력: ");
		String userEmail = scn.next();
		
		if(email.equals(userEmail)) {
			System.out.println("이메일이 중복되어 있습니다. 다시 입력해주세요.");
		}
		
		scn.close();
	}
}


