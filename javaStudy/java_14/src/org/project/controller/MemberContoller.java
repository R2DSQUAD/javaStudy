package org.project.controller;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.project.dto.MemberDto;
import org.project.service.MemberService;
import org.project.service.Impl.MemberServiceImpl;
import org.project.connect.DBConnect;

public class MemberContoller {
	public static void main(String[] args) {
		System.out.println("MemberContoller");
		Connection conn = DBConnect.getConnection();
		System.out.println(conn);
		
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		MemberService service = null;
		while (!bool) {
			System.out.print("프로그램을 실행하시겠습니까? (y/n) : ");
			String s = sc.next();
			if(s.equals("y")) {
				System.out.print("쿼리 문을 입력하세요 (insert, select, update, delete) :");
				String query = sc.next();
				if(query.equals("insert") || query.equals("select") || query.equals("update") || query.equals("delete")) {
					if(query.equals("insert")) {
						System.out.println("회원가입 실행");
						System.out.print("memberId : ");
						Long memberId = sc.nextLong();
						System.out.print("userEmail : ");
						String userEmail = sc.next();
						System.out.print("userPw : ");
						String userPw = sc.next();
						
						try {
							service.insert(new MemberDto(memberId, userEmail, userPw, LocalDateTime.now(), null));
						}catch(Exception e) {
							e.printStackTrace();
						}
						
					}else if(query.equals("select")){
					}else if(query.equals("update")){
						
					}else if(query.equals("delete")){
						
					}
				}else if (query.equals("exit")) {
					System.out.println("프로그램을 종료합니다");
					bool = true;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}else {
				System.out.println("프로그램을 종료합니다");
				bool = true;
			}
		}
	}
}
