package org.java.inheritannce;

//모든 클래스는 Object 클래스를 상속 받는다.
class Parent{
	int a;
	int b;
	private int c;
	protected int d;

	public void m1() {
		System.out.println("m1() -> super");

	}
}

//Sub1 클래스 -> Parent클래스로 부터 상속
class Sub1 extends Parent{
	int s1;
	int s2;
	
	@Override
	public void m1() {
		System.out.println("m1() -> Sub");
		super.m1();
	}
	
	public void m2() {
		System.out.println("m2()");
	}
	
}

public class InheritanceEx1 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Sub1 s1 = new Sub1();
		s1.d=100;
		s1.m1();
	}
}
