package org.java.oop;

// 추상클래스 -> 추상 매서드가 있는 클래스
abstract class Ab1 {
	
	//일반 멤버
	int a;
	
	//선언부만 있고 구현부가 없는 매서드 -> 미완성 메서드
	abstract void m1();	// 반드시 상속을 통해서 구현(오버라이딩)
	
	void m2() {
		System.out.println("m2() -> 일반멤버");
	}
	
}

class Ab1Sub extends Ab1{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1() -> 추상메서드 오버라이드");
	}
	
}

public class AbstractEx {
	public static void main(String[] args) {
//		new Ab1(); //객체를 생성하지 못함 (new)
		Ab1Sub a1 = new Ab1Sub();
		a1.m1();
	}
}
