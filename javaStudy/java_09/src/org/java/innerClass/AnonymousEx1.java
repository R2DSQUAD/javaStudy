package org.java.innerClass;

class A{
	void m1() {
		System.out.println("m1");
	}
}

//구현 객체 역할만 ASup
//class ASup extends A{
//
//	@Override
//	void m1() {
//		System.out.println("m1 -> 오버라이드");
//	}
//}

public class AnonymousEx1 {
	public static void main(String[] args) {
//		ASup a1 = new ASup();
		
		//무명(익명)클래스를 생성하고 부모 클래스 A를 상속
		//다형성 -> 부모타입의 객체 참조 변수 a1
		A a1 = new A() {

			@Override
			void m1() {
				System.out.println("m1-> 오버라이드");
			}
			
		};
		a1.m1();
	}
}
