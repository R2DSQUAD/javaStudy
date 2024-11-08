package org.java.controller;

import java.util.Scanner;

import org.java.service.impl.MemberDeleteService;
import org.java.service.impl.MemberInsertService;
import org.java.service.impl.MemberSelectService;
import org.java.service.impl.MemberUpdateService;

public class MemberController {
	public static void main(String[] args) {
		
		boolean isTrue = false;
		Scanner sc = new Scanner(System.in);
		
		while(isTrue) {
			System.out.println("프로그램을 실행하시겠습니까? (Y/N)");
			String start = sc.next();
			if (!start.equals("exit")) {		
				if(start.equals("y")|| start.equals("Y")) {
					System.out.println("(insert, update, select, delete)");
					System.out.print("쿼리 문을 입력하세요 : ");
					String sql = sc.next();
						switch (sql) {
						case "insert":
							MemberInsertService insert = new MemberInsertService();
							System.out.println(insert);
							break;
						case "update":
							MemberUpdateService update = new MemberUpdateService();
							System.out.println(update);
							break;
						case "select":
							MemberSelectService select = new MemberSelectService();
							System.out.println(select);
							break;
						case "delete":
							MemberDeleteService delete = new MemberDeleteService();
							System.out.println(delete);
							break;
						case "exit":
							isTrue = true;
							break;
						default :
							
						
					}
					
					
				}
			}
		}
	}
}
