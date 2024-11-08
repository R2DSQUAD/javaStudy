package org.java.interfaceEx;

//인터페이스 끼리만 상속 가능
public interface InterfaceEx1 {
	public static final String PROJECT_NAME="WEB2025";
	public abstract void abstractMethod();
	
	//상속 시 구현할지 말지 결정
	public default void m1() {
		System.out.println("m1");
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
	//인스턴스 메서드 X
//	public void m3() {
//	}
}
