package org.java.oop;

//같은 패키지에서만 접근 가능
class D {
	public int a;
	int b;
	private int c;
	protected int d;
	public static final int MAX_BOTTOM=100;
	
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "D [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
}
