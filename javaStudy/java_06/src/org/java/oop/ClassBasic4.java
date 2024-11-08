package org.java.oop;

import java.util.Date;

public class ClassBasic4 {
	
	//클래스의 멤버
	
	//필드
	public int num1;							//인스턴스 멤버
	public int num2;							//인스턴스 멤버
	public int[] arrInt;						//배열,	인스턴스 멤버
	public Date date;							//객체,	인스턴스 멤버
	public Calculator calculator;				//객체,	인스턴스 멤버
	
	
	public static final int MAX_NUM = 10000;	//클래스 멤버
	
	//생성자 -> 메서드, 클래스와 이름이 똑같은 매서드, 반환 타입이 없다. (void)-> void는 생략 -> 객체 생성 시 객체의 타입을 선택할 수 있다.
	public ClassBasic4() {
		//매개인자가 없는 생성자
		//기본 생성자는 컴파일러가 자동으로 생성한다. 생략가능
		//단, 다른생성자가 생성될 경우 자동으로 생성되지 않음.
		System.out.println("기본 생성자");		
	}
	
	//메서드
	public void instanceMethod() {
		System.out.println("인스턴스 매서드");
	}
	
	public static void staticMethod() {
		System.out.println("static 매서드");
	}
}
