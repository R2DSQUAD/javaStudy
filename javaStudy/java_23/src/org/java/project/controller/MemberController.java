package org.java.project.controller;

import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Severity;

import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.impl.MemberServiceImpl;

public class MemberController {

	public static void RequestMapping() {

		System.out.println("MemberController");

		Scanner input = new Scanner(System.in);

		boolean bool = false;

		MemberService service = new MemberServiceImpl();

		while (!bool) {
			System.out.println("프로그램 시작?(exit)");
			String q = input.next();

			if (!q.equals("exit")) {

				while (!bool) {
					System.out.println("쿼리문 입력?(exit)");

					String query = input.next();
					if (query.equals("insert")) {
						// 회원가입
						// userEmail
						System.out.println("userEmail: ");
						String userEmail = input.next();
						// userName
						System.out.println("userName: ");
						String userName = input.next();
						// age
						System.out.println("age: ");
						int age = input.nextInt();

						// 회원가입 시 userEmail, userName, age
						int rs = service.save(new MemberDto(null, userEmail, userName, age, null, null, null));

						if (rs == 1) {
							System.out.println("회원가입 성공! 로그인페이지로 이동!");
						} else {
							System.out.println("회원가입 실패!!");
						}

					} else if (query.equals("delete")) {

					} else if (query.equals("update")) {
						//1. 회원 확인 -> member_id 검사 
						// 회원상세조회 -> 회원수정페이지 
						System.out.println("회원아이디: ");
						Long memberId = input.nextLong();

						MemberDto memberDto = service.findById(memberId);

						System.out.println("회원정보: "+memberDto);
						// userEmail
						System.out.println("userEmail: ");
						String userEmail = input.next();
						// userName
						System.out.println("userName: ");
						String userName = input.next();
						// age
						System.out.println("age: ");
						int age = input.nextInt();
						// memberId -> 수정불가능
						// createTime -> 수정불가능
						// role -> 수정불가능 (관리자만 변경)
						int rs = service.updateSave(new MemberDto(memberId, userEmail, userName, age,
								memberDto.getRole(), memberDto.getCreateTime(), null));

						if (rs == 1) {
							System.out.println("회원수정 성공!!");
						}

					} else if (query.equals("detail")) {
						// userEmail
						System.out.println("회원아이디: ");
						Long memberId = input.nextLong();

						MemberDto memberDto = service.findById(memberId);
						System.out.println(memberDto);

					} else if (query.equals("select")) {
						List<MemberDto> mList = service.findAll();
						mList.forEach(member -> System.out.println(member));

					} else if (query.equals("exit")) {
						System.out.println("종료!!");
						bool = true;
					}
				}

			} else {
				System.out.println("멤버 종료!!");
				return;
			}
		}

	}
}
