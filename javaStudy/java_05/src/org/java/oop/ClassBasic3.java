package org.java.oop;

public class ClassBasic3 {
	
	//클래스의 멤버 3개 -> 필드, 생성자, 메서드, 내부 클래스 ...
	
	class A{
		//내부 클래스
	}
	
	//필드 -> 접근 제한자 타입 필드명; 
	//인스턴스 멤버 -> new 
	public int num1;
	public int num2;
	protected String num3;
	private String password;
	int defaultNum;
	
	//클레스 멤버(static)
	public static final int MAX_MIN= 100; //final은 첫글자 무조건 대문자
	
	//생성자 -> 객체 생성 시 필요, 객체 타입 선택, 상속, 기본생성자는 생략 가능
	//기본 생정자는 컴파일러가 자동으로 생성해줌
	public ClassBasic3() {	
		//return 안함
		System.out.println("기본 생성자");
	}
		
	//인스턴스 메서드
	public void instanceMethod() {
		System.out.println("instanceMethod");
	}
	
	//클래스 메서드
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	
	@Override	//객체의 정보를 가지고 있는 메서드
	public String toString() {
		String rs="num1= "+this.num1+", num2= "+this.num2+", num3= "+this.num3 + ", defaultNum= "+this.defaultNum;
		return rs;
	}
}