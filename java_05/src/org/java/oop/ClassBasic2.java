package org.java.oop;

public class ClassBasic2 {
	public int num1; //모든패키지
	protected int num2; //상속관계
	String name;	//같은패키지
	private int password; //같은클래스 내
	
	public void instance1() {
		System.out.println("인스터스 메서드1");
	}
	
	//같은 클래스 내 캡슐화
	private void privateMethod() {
		System.out.println("privateMethod");
	}
}
