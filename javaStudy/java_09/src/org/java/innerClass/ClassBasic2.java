package org.java.innerClass;

import java.util.Date;

public class ClassBasic2 {
	//멤버 1. 인스턴스 멤버, 2. 클래스 멤버 -> static, 클래스명.멤버
	
	//1. 필드
	public int a;
	public String name;
	public int[] arrInt;
	public Date date;
	public Member member;	//사용자 정의 타입 -> 클래스 -> 객체 (obj type)
	
	//overroad, void이므로 return 생략
	public void m1 () {
		System.out.println("m1");
//		return;
	}
	
//	public static void staticMethod();
	
	//overroad
	public int m1(int a) {
		this.a=a;
		return a;
	}
	
	public double m2 () {
		return 1.1;
	}
	
	public String m3() {
		return "문자열";
//		return null;
	}
	
	public Date day() {
		Date date = new Date();
		
		return date;
	}
	
	public Member m4() {
		Member member= new Member();
		return new Member();
	}
	
	
}