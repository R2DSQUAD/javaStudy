package org.java.modify;

//다른 패키지에서도 접근 가능
public class A {
	public int a;	
	int b;	//같은 패키지에서만 접근 가능
	private int c;
	protected int d;
	public static final int MAX=1000;
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getC() {
		return c;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
}
