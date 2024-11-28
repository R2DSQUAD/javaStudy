package org.java.project.controller;

import java.util.Scanner;

public class FrontController {
	public static void main(String[] args) {
		System.out.println("filter -> FrontController");
		
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		while(!bool) {
			System.out.println("RequestMapping -> (member, board)!");
			System.out.print("요청할 내용을 작성해주세요: ");
			String HttpServletRequest=sc.next(); 
			if(HttpServletRequest.equals("board")) {
				BoardController.RequestMapping();
			}else if(HttpServletRequest.equals("member")) {
				MemberController.RequestMapping();
			}else if(HttpServletRequest.equals("exit")) {
				System.out.println("종료");
				bool= true;
			}
			else {
				throw new IllegalArgumentException("요청 URL이 없습니다!!");
			}
		}
		
		
		
		sc.close();
	}
}
