package org.java.controller;

import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.service.MemberService;
import org.java.service.impl.MemberDeleteService;
import org.java.service.impl.MemberInsertService;
import org.java.service.impl.MemberSelectService;
import org.java.service.impl.MemberUpdateService;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("MemberController");
		Scanner input = new Scanner(System.in);
		boolean bool = false;
		
		while(!bool) {
			System.out.println("실습예제를 시작하시겠습니까? (exit 종료)");
			String q = input.next();
			if(!q.equals("exit")) {
				while(!bool) {
					System.out.println("쿼리문을 입력하세요 (insert, select, update, delete)?(exit 종료)");
					String query = input.next();
					MemberService service = null;
					
					if(query.equals("insert")) {
						service = new MemberInsertService();
						service.excuteMemberService();
					} else if(query.equals("select")) {
						service = new MemberSelectService();
						service.excuteMemberService();
					} else if (query.equals("update")) {
						service = new MemberUpdateService();
						service.excuteMemberService();
					} else if (query.equals("delete")){
						service = new MemberDeleteService();
						service.excuteMemberService();
					} else if (query.equals("exit")){
						System.out.println("종료");
						bool=true;
					}else {
						System.out.println("쿼리문 입력오류!!");
					}
				}
			}else {
				System.out.println("종료");
				bool=false;
			}
		}
}}
