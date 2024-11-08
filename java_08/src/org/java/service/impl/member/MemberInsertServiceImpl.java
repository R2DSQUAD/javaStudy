package org.java.service.impl.member;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.dto.MemberDto;
import org.java.service.impl.MemberService;

public class MemberInsertServiceImpl extends MemberService{

	@Override
	public void excuteQueryService() {
		System.out.println("회원가입 Service");
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		while(!bool) {
			System.out.println("회원기입 실행");
			String quest = sc.next();
			
			if(!quest.equals("exit")) {
				System.out.println("아이디: ");
				int memberId = sc.nextInt();
				System.out.println("이메일: ");
				String userEmail = sc.next();
				System.out.println("비밀번호: ");
				String userPw = sc.next();
				System.out.println("이름: ");
				String userName = sc.next();
				System.out.println("주소: ");
				String userAddr = sc.next();
				
				MemberDto member = new MemberDto(memberId, userEmail, userPw, userName, userAddr, null, LocalDateTime.now(), null);
			}
		}
	}
}
