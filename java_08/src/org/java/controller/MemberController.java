package org.java.controller;

import java.util.Scanner;

import org.java.service.impl.MemberService;
import org.java.service.impl.member.MemberDeleteServiceImpl;
import org.java.service.impl.member.MemberInsertServiceImpl;
import org.java.service.impl.member.MemberSelectServiceImpl;
import org.java.service.impl.member.MemberUpdateServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("회원 -> Controller");

		// Create Read Update Delete
		// RestAPI POST GET PUT, PATCH, DELETE
		// Query INSERT SELECT UPDATE DELETE
		// Query -> Scanner 입력 받아서 각각의 서비스를 구현
		// while, 조건문

		Scanner sc = new Scanner(System.in);
		boolean bool = false;

		while (!bool) {
			System.out.println("회원 서비스를 시작하시겠습니까? (exit 종료)");
			String q = sc.next();
			if (!q.equals("exit")) {
				while (true) {
					System.out.println("쿼리문을 입력하세요 (insert, select, update, delete) (exit 종료)");
					String query = sc.next();

					if (query.equals("insert")) {
						MemberService service = new MemberInsertServiceImpl();
						service.excuteQueryService();
					} else if (query.equals("select")) {
						MemberService service = new MemberSelectServiceImpl();
						service.excuteQueryService();
					} else if (query.equals("update")) {
						MemberService service = new MemberUpdateServiceImpl();
						service.excuteQueryService();
					} else if (query.equals("delete")) {
						MemberService service = new MemberDeleteServiceImpl();
						service.excuteQueryService();
					} else if (query.equals("exit")) {
						System.out.println("종료합니다.");
						bool = true;
						break;
					} else if (query.equals("close")) {
						System.out.println("반복문을 종료합니다.");
						break;
					} else {
						System.out.println("쿼리문 입력 오류");
					}
				}
			} else {
				System.out.println("종료합니다.");
				bool = true;
			}
		}
		sc.close();
	}
}
