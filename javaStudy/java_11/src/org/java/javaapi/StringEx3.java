package org.java.javaapi;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		
		//JAVA -> Servlet
		
		String query1="/insert.do";
		String query2="/list.do";
		String query3="/update.do";
		String query4="/memberDelete.do";

		// .do 제외한 나머지 문자열
		
		System.out.println(query1.substring(0));
		System.out.println(".do 제외한 나머지 문자열 ");		
		System.out.println(query1.substring(0,7));
		System.out.println(query1.substring(0,query1.length()-3));
		
		System.out.println(query2.substring(0,5));
		System.out.println(query2.substring(0,query2.length()-3));
		
		System.out.println(query3.substring(0,7));
		System.out.println(query3.substring(0,query3.length()-3));
		
		System.out.println(query4.substring(0,13));
		System.out.println(query4.substring(0,query4.length()-3));
		
		Scanner input = new Scanner(System.in);
		System.out.print("URL 입력: ");
		String inputStr = input.next();
		
		//.do 제거
		String query = inputStr.substring(0, inputStr.length()-3);
		
		if(query.equals("/insert")) {
			System.out.println("회원가입");
		}else if(query.equals("/list")){
			System.out.println("회원목록조회");
		}else if (query.equals("/update")) {
			System.out.println("회원수정");
		}else if (query.equals("/memberDelete")) {
			System.out.println("회원삭제");
		}else {
			System.out.println("입력오류");
		}
	}
}
