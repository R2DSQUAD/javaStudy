package org.java.innerClass;

import java.util.Date;

public class ClassBasic2Main {
	public static void main(String[] args) {
		ClassBasic2 c1 = new ClassBasic2();
		
		int i=10;
		
		c1.a=10;
		c1.name="m1";
		c1.arrInt=new int[] {1,2,3};
		c1.member = new Member(10, "m2");
		
		// 객체형
		// member1 -> 객체 참조 변수 -> 객체의 주소
		// new -> 객체 생성 연산자(주소값)
		// 객체화 -> 인스턴스화
		Member member1 = new Member(10,"m1");
		
		
	}
}