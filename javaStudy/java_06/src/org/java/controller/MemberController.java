package org.java.controller;
import java.util.Scanner;

import org.java.oop.MemberDto;
import org.java.oop.Role;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("main");
	
		MemberDto member1 = new MemberDto(1, "a@gmail.com", "1111", "a", Role.ADMIN);
		MemberDto member2 = new MemberDto(2, "b@gmail.com", "2222", "b", Role.MEMBER);
		MemberDto member3= new MemberDto(3, "c@gmail.com", "3333", "c", Role.MEMBER);
		MemberDto member4 = new MemberDto(4, "d@gmail.com", "4444", "d", Role.MEMBER);
		MemberDto member5 = new MemberDto(5, "e@gmail.com", "5555", "e", Role.MEMBER);
		
		System.out.print("id="+member1.getMemberId());
		System.out.print(", email"+member1.getEmail());
		System.out.print(", pw="+member1.getPw());
		System.out.print(", niceNmae="+member1.getNickName());
		System.out.println(", ROLE="+member1.getRole());
		
		System.out.print("id="+member2.getMemberId());
		System.out.print(", email"+member2.getEmail());
		System.out.print(", pw="+member2.getPw());
		System.out.print(", niceNmae="+member2.getNickName());
		System.out.println(", ROLE="+member2.getRole());
		
		System.out.print("id="+member3.getMemberId());
		System.out.print(", email"+member3.getEmail());
		System.out.print(", pw="+member3.getPw());
		System.out.print(", niceNmae="+member3.getNickName());
		System.out.println(", ROLE="+member3.getRole());
		
		System.out.print("id="+member4.getMemberId());
		System.out.print(", email"+member4.getEmail());
		System.out.print(", pw="+member4.getPw());
		System.out.print(", niceNmae="+member4.getNickName());
		System.out.println(", ROLE="+member4.getRole());
		
		System.out.print("id="+member5.getMemberId());
		System.out.print(", email"+member5.getEmail());
		System.out.print(", pw="+member5.getPw());
		System.out.print(", niceNmae="+member5.getNickName());
		System.out.println(", ROLE="+member5.getRole());
		
		boolean isTrue = false;
		Scanner sc = new Scanner(System.in);
		MemberDto dto = new MemberDto();
		
		while (!isTrue) {
			System.out.println("프로그램을 키시겠습니까? (Y/N)");
			String on = sc.next();		
			if(on.equals("y")||on.equals("Y")) {
				{
					if (!on.equals("exit")) {
						System.out.print("이메일을 입력하세요: ");
						String email = sc.next();
						System.out.print("PW를 입력하세요: ");
						String pw = sc.next();
						System.out.print("닉네임을 입력하세요: ");
						String nickName = sc.next();
						System.out.print("권한을 입력하세요: ");
						String role = sc.next();
						
						dto.setEmail(email);
						dto.setPw(pw);
						dto.setNickName(nickName);
						
						Role roleObj = null;
						
						if (role.equals("ADMIN")) {
							roleObj = Role.ADMIN;
						} else if (role.equals("MANAGER")) {
							roleObj = Role.MANAGER;
						} else {
							roleObj = Role.MEMBER;
						}
						
						MemberDto mb = new MemberDto(1, email, pw, nickName, roleObj);
						
						System.out.println("MemberDto [memberId=" + 1 + ", email=" + email + ", pw=" + pw + ", nickName=" + nickName
								+ ", role=" + roleObj + "]");
					}	
					else {
						System.out.println("프로그램 종료");
						isTrue= true;
					}
				}
			}else {
				System.out.println("프로그램 종료");
				isTrue = true;
			}
				
		}
		
	}
	
	
}
