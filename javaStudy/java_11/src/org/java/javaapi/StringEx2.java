package org.java.javaapi;

import java.util.Scanner;

public class StringEx2 {
	public static void main(String[] args) {
		System.out.println("String");
		
		String s1="java";
		String s2="Mysql";
		String s3="java Project 2025";
		String s4=" Spring boot JPA Security ";
		System.out.println("문자열 길이");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());	// 공란이 포함
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력: ");
//		String userPw=sc.next();
		
//		if(userPw.length()<=5) {
//			System.out.println("비밀번호는 6글자 이상 입력하세요");
//		}
		
		System.out.println(s2.charAt(1));
		System.out.println(s2.codePointAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println("a".compareTo("b"));
		System.out.println("b".compareTo("a"));
		System.out.println("a".compareTo("a"));
		
		String s12=s1.concat(s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s12);
		
		System.out.println(s3);
		System.out.println(s3.replace("java","Spring"));
		System.out.println(s3);
		String s32 = s3.replace("java", "Spring");
		System.out.println(s32);
		
		System.out.println(s3);
		System.out.println(s3.split(" "));
		
		//java Project 2025
		// {"java", "Project" "2025"}
		String[] arrS3 = s3.split(" ");
		
		//for in -> 확장형 for문 -> 그룹화된 객체를 조회 forEach, stream
		//for 타입 변수 : 배열 객체
		//모든 배열의 요소를 조회
		
		for (String str : arrS3) {
			System.out.print(str+ " ");
		}
		for(int i=0; i<arrS3.length; i++) {
			System.out.println(arrS3[i]);
		}
		System.out.println();
		
		//.String s4 = " Spring boot JPA Security ";
		System.out.println(s4);
		System.out.println(s4.substring(1));
		//"spring_first","spring_second"
		System.out.println("spring_first".substring(7));
		System.out.println("spring_second".substring(7));
		
		// subString(int 시작번지, 끝번지) : 문자열을 시작번지부터 끝번지 앞까지 추출
		
		System.out.println(s4.substring(1,7));
		System.out.println(s4.substring(1,12));
		System.out.println(s4);
		String s42 = s4.substring(1,12);
		System.out.println(s42);
		
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
	}
}
