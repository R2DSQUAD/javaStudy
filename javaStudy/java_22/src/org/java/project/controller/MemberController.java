package org.java.project.controller;

import java.util.List;
import java.util.Scanner;

import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.Impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("MemberController");
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		MemberService service = new MemberServiceImpl();

		while (!bool) {
			System.out.println("프로그램 실행 (exit)");
			String q = sc.next();

			if (!q.equals("exit")) {
				System.out.println("쿼리문 입력 (exit)");
				String query = sc.next();
				if (query.equals("insert")) {
					System.out.println("회원가입 실행");
					System.out.print("userEmail : ");
					String userEmail = sc.next();
					System.out.print("userName : ");
					String userName = sc.next();
					System.out.print("age : ");
					int age = sc.nextInt();

					int rs = service.save(new MemberDto(null, userEmail, userName, age, null, null, null));

					if (rs == 1) {
						System.out.println("회원가입 성공 로그인 페이지 이동");
					} else {
						System.out.println("회원가입 실패");
					}
				} else if (query.equals("select")) {
					List<MemberDto> mList = service.findAll();
					mList.forEach(member -> {
//						System.out.println(member);
						System.out.print(member.getUserEmail()+" ");	
						System.out.print(member.getUserName()+" ");	
						System.out.print(member.getAge()+ " ");	
						System.out.print(member.getCreateTime()+ " ");	
						System.out.println(member.getAge()+ " ");	
					});
					
					

				} else if (query.equals("detail")) {
					System.out.println("회원 아이디: ");
					Long memberId = sc.nextLong();

					MemberDto memberDto = service.findById(memberId);
					System.out.println(memberDto);
				} else if (query.equals("update")) {
					System.out.println("회원 아이디: ");
					Long memberId = sc.nextLong();
					MemberDto memberDto = service.findById(memberId);
					
					System.out.println("userEmail: ");
					String userEmail = sc.next();
					
					System.out.println("userName: ");
					String userName = sc.next();
					
					System.out.println("age: ");
					int age = sc.nextInt();
					
					int rs = service.updateSave(new MemberDto(memberId, userEmail, userName, age, null, null, null));
				} else if (query.equals("exit")) {
					System.out.println("종료");
					bool = true;
				}

			} else {
				System.out.println("종료");
				bool = true;
			}
		}
	}
}
