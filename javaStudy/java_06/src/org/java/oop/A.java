package org.java.oop;

class A {
	public int a;
	int b;
	protected int c;
	private int ddata;


	//setter -> method
	//private 멤버(필드) -> 외부에서 접근 -> set
	public void setDdata(int ddata) {
		this.ddata=ddata;
	}
	
	//getter -> method
	//private 멤버(필드) -> setter -> getter
	public int getDdata() {
		return ddata;
	}
}