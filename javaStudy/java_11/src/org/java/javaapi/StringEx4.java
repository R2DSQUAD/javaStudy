package org.java.javaapi;

import java.util.Scanner;

public class StringEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		
		while(!bool) {
			System.out.print("URL을 입력하세요 : ");
			String first = sc.next();
			if(first.contains(".do") || first.equals("/exit.do")) {
				String url =first.substring(0, first.length()-3);
				if(url.equals("/insert")) {
					System.out.println("회원가입");
					System.out.println(url);
				} else if (url.equals("/select")) {
					System.out.println("회원조회");
					System.out.println(url);
				} else if (url.equals("/update")) {
					System.out.println("회원수정");
					System.out.println(url);
				} else if (url.equals("/delete")) {
					System.out.println("회원삭제");
					System.out.println(url);
				} else if (url.equals("/exit")) {
					System.out.println("프로그램을 종료합니다");
					System.out.println(url);
					bool = true;
				} else {
					System.out.println("다시 입력해 주세요."); //404 (존재하지 않음)
				}
			}else{
				System.out.println("다시 입력해 주세요.");
			};
		}
	}
}
