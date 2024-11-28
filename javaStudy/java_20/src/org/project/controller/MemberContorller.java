package org.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.project.dto.MemberDto;
import org.project.service.MemberService;
import org.project.service.Impl.MemberServiceImpl;

//@Controller		-> 페이지 이동

public class MemberContorller {
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
					System.out.print("memberId : ");
					Long memberId = sc.nextLong();
					System.out.print("userEmail : ");
					String userEmail = sc.next();
					System.out.print("userPw : ");
					String userPw = sc.next();
					System.out.print("age : ");
					int age = sc.nextInt();
					System.out.print("address : ");
					String address = sc.next();

					int rs = service.save(new MemberDto(memberId, userEmail, userPw, age, address, null, null, null));
					if (rs == 1) {
						System.out.println("MemberController");
					}
				} else if (query.equals("select")) {
					Map<String, List<MemberDto>> map = new HashMap<String, List<MemberDto>>();
					List<MemberDto> memberDtos = service.findAll();

					map.put("memberList", memberDtos);

					map.get("memberList").forEach(member -> System.out.println(member));
				} else if (query.equals("delete")) {
					System.out.println("id: ");
					Long memberId = sc.nextLong();

					int rs = service.deleteId(memberId);

					if (rs == 1) {
						System.out.println("회원 탈퇴 성공");
					}
				} else if (query.equals("detail")) {
					System.out.println("id: ");
					Long memberId = sc.nextLong();
					Map<String, MemberDto> map = new HashMap<String, MemberDto>();
					MemberDto memberDto = service.findbyId(memberId);
					map.put("member", memberDto);
					System.out.println(map.get("member"));
				}

				else if (query.equals("exit")) {
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
