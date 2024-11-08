package org.java.oop;


/*
 접근제한자 (접근지정자) class 클래스명 {}
 modifiers
  
 
 */


public class ClassBasic {
	//멤버
	
	// 필드, 속성, 프로퍼티
	public int num1;	//인스턴스멤버	new	Heap
	public int num2;	//인스턴스멤버 new Heap
	public String name;	//인스턴스멤버 new Heap
	public static int staticNUM;			//클래스 멤버 new X Method
	//final -> 반드시 값을 초기화 해야함, 대문자로 작성
	public static final int MAXNUM=1000;	//클래스 멤버, 클래스명.멤버	new X Method

	//생성자 -> 객체 생성을 위한 특별한 메서드
	//클래스 명과 동일
	//반환타입 void -> 생략
	//객체의 타입을 결정할 수 있다.
	//생략이 가능 -> 자동으로 컴파일러가 기본생성자를 생성해준다.
	public ClassBasic() {
		System.out.println("생성자(construct) -> 기본 생성자");
	}
	
	//메서드
	/*
	 	//선언부 (Declaration)
		접근제한자 반환타입 메서드명(){
		//구현부 (Implementation)
		//return; //반드시 -> return값을 반환하고 메모리에서 사라진다.
		}
	*/
	
	
	//인스턴스 멤버
	public void instanceMethod() {
		System.out.println("인스턴스 메서드");
	}
	
	//클래스(static) 멤버
	public static void classMathod() {
		System.out.println("클래스(static) 메서드");
	}
	
	//클래스 멤버 -> 공유하고 싶은데 데이터
}
