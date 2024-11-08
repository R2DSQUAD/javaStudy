package org.java.interfaceEx;

public class InterfaceEx1Main {
	public static void main(String[] args) {

		//인터페이스는 객체를 생성할 수 없다.
		//반드시 상속을 통해서 구현 객체를 생성한다.
		//추상메서드는 오버라이딩을 통해서 구현
		
//		new InterfaceEx1();
		
//		InterfaceEx1Sub1 i2 = new InterfaceEx1Sub1();
		InterfaceEx1 i2 = new InterfaceEx1Sub1();
		i2.abstractMethod();
		
		//다형성 -> 부모타입의 객체참조 변수 -> 자식 객체를 참조
		InterfaceEx1 i3 = new InterfaceEx1() {
			@Override
			public void abstractMethod() {
				System.out.println("익명클래스 -> abstractMethod -> 오버라이딩");
				
			}
		};
		i3.abstractMethod();
//		new X 인터페이스(),추상클래스(),일반클래스(){
			//오버라이딩메서드 -> 추상메서드는 강제로 오버라이드
			//부모의 멤버
//		};
	}
}