package org.java.absract;

public class AbstractEx1Sub extends AbstractEx1 {
	
	int num3;
	int num4;
	
	@Override
	public void abstractMethod() {
		System.out.println("추상메서드 abstractMethod -> 오버라이딩");
		
	}
	public void m1(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
	}
}
