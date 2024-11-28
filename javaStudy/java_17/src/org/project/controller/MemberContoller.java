package org.project.controller;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.project.connect.DBConnect;
import org.project.dto.MemberDto;
import org.project.service.MemberService;
import org.project.service.Impl.MemberServiceImpl;

public class MemberContoller {
	public static void main(String[] args) {
		System.out.println("MemberContoller");

		Connection conn = DBConnect.getConnection();
		System.out.println(conn);

		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		MemberService service = new MemberServiceImpl();

		while (!bool) {
			System.out.print("프로그램을 실행하시겠습니까? (y/n) : ");
			String s = sc.next();
			if (s.equals("y")) {
				System.out.print("쿼리 문을 입력하세요 (insert, select, update, delete) :");
				String query = sc.next();
				if (query.equals("insert") || query.equals("select") || query.equals("update")
						|| query.equals("delete") || query.equals("detail")) {
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

						MemberDto dto = new MemberDto(memberId, userEmail, userPw, age, address, null, null, null);
						int rs = service.save(dto);
						if (rs == 1) {
							System.out.println("회원가입 성공, 로그인 페이지로 이동");
						}

					} else if (query.equals("select")) {
						Map<String, List<MemberDto>> map= new HashMap<String, List<MemberDto>>();
						try {
							List<MemberDto> memberDtos = service.findAll();
							map.put("memberList", memberDtos);
							
							Set<String> set = map.keySet();
							Iterator<String> iterator = set.iterator();
							
							while(iterator.hasNext()) {
								String keyStr = iterator.next();
								map.get(keyStr).forEach(System.out::println);
							}
						}catch(Exception e) {
							e.printStackTrace();
						}
					} else if (query.equals("detail")) {
						System.out.println("회원 수정");
						try {
							
						
						System.out.println("조회할 아이디: ");
						Map<String, MemberDto> map = new HashMap<String, MemberDto>();
						Long memberId = sc.nextLong();
						MemberDto memberDto = service.findbyId(memberId);
						map.put("member",memberDto);
						System.out.println(map.get("member"));
						} catch(Exception e) {
							e.printStackTrace();
						}
						

					}else if (query.equals("update")) {

					} else if (query.equals("delete")) {
						System.out.println("회원 삭제");
						
						try {
							System.out.println("삭제할 아이디: ");
							Map<String, MemberDto> map = new HashMap<String,MemberDto>();
							Long memberId = sc.nextLong();
							MemberDto memberDto = service.findbyId(memberId);
							map.put("member",memberDto);
							System.out.println("아이디가 삭제되었습니다.");
						}catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				} else if (query.equals("exit")) {
					System.out.println("프로그램을 종료합니다");
					bool = true;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} else {
				System.out.println("프로그램을 종료합니다");
				bool = true;
			}
		}
	}
}
