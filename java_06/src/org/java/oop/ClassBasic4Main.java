package org.java.oop;

import java.util.Date;

public class ClassBasic4Main {
	public static void main(String[] args) {
		
		//객체 생성, 객체 생성 연산자 new -> 주소
		ClassBasic4 c1 =new ClassBasic4();
		
		
		//사용자 정의 타입 클래스
		
		//c1 -> 객체 참조 연산자 <- 주소, 객체, 인스턴스
		//객체화, 인스턴스화
		System.out.println(c1);
		System.out.println(new ClassBasic4());
		System.out.println(c1==new ClassBasic4());
		//주소 다름
		
		c1.num1=100;
		c1.num2=200;
		c1.arrInt=new int[] {1,2,3,4,5};
		c1.date = new Date();
		c1.calculator = new Calculator();
		
		System.out.println(c1.num1+c1.num2);
		System.out.println(c1.arrInt);
		System.out.println(c1.date);
		System.out.println(c1.calculator);
		
		c1.instanceMethod();
		
		ClassBasic4 c2 =new ClassBasic4();
		System.out.println(c2.toString()); //객체의 정보
		
		
		ClassBasic4 c3 =new ClassBasic4();
		System.out.println(c3.toString()); //객체의 정보
		
		c1.staticMethod();
	}
}
