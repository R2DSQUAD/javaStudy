package org.java.varEx;

public class VarEx5 {
	public static void main(String[] args) {
		System.out.println("참초형(객체형 Object)");
		
		//obj -> 객체 참조 연산자(객체의 주소 값을 저장)
		Object obj = new Object(); //new -> 객체 생성, new 생성자()
		//Object -> 모든 자바 클래스의 부모 클래스 (Super Class)
		
		System.out.println(obj);
		// . -> 객체 접근 연산자
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
}
