package org.java.varEx;

class A {
	public int a; // 멤버 필드, 프로퍼티(속성) 인스턴스 멤버
	public int b; // 멤버 필드, 프로퍼티(속성) 인스턴스 멤버

	// 멤버 (필드, 프로퍼티(속성)) static 멤버
	public static final int MAXNUIM = 1000;

	// 멤버 메서드

	// 매개변수(인자) -> 지역변수
	public void m1(int i) { // 메서드
		int c = 10 + i; // 지역변수
		System.out.println(c + " 지역변수");
	}}
	

public class VarEx3 {
	public static void main(String[] args) {
			System.out.println("변수의 종류(클래스 멤버 포함)");	
			//a1 -> 객체 참조 변수 -> 객체의 주소값을 저장하는 변수
			A a1 = new A(); //객체생성 new -> 객체 생성 연산자
}
}
