package org.java.absract;

//추상클래스 -> 추상메서드는 클래스
public abstract class AbstractEx1 {
	public int num1;
	public int num2;
	
//	public AbstractEx1() {
//		// TODO Auto-generated constructor stub
//	}
	
	//선언부
	public void instanceMethod() {
		//구현부
		System.out.println("instanceMethod()");
	}
	
	//추상메서드
	public abstract void abstractMethod();
	
	
}
