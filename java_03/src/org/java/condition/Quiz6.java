package org.java.condition;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		System.out.println("Query -> if문");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("쿼리(query)문을 입력하세요");
		String query = scn.next();
		
		
//		if (query.equals("insert") || query.equals("update") || query.equals("select") || query.equals("delete")) {
//			if(query.equals("insert")) {
//				System.out.println("회원가입 페이지로 이동합니다.");
//			}else if(query.equals("update")) {
//				System.out.println("회원수정 페이지로 이동합니다.");
//			}else if(query.equals("select")) {
//				System.out.println("회원조회 페이지로 이동합니다.");
//			}else if(query.equals("delete")) {
//				System.out.println("회원탈퇴 페이지로 이동합니다.");
//			}
//		}else {
//			System.out.println("쿼리문 입력 오류 입니다.");
//		}
		
		Quiz6_Sub sub = new Quiz6_Sub(query);
		
		String queryMt = sub.queryMethod();
		
		System.out.println(queryMt);
		scn.close();
	}
}
