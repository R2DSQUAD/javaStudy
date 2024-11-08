package org.java.oop;

class Parent{
	int a;
	
	void m1() {
		System.out.println("m1()-> Parent");
	}
}
class Sub1 extends Parent {
	int b;
	void m2() {
		System.out.println("m2() -> Sub1");
	}
	@Override
	void m1() {
		// TODO Auto-generated method stub
		super.m1();
		System.out.println("m1() -> 오버라이드 메서드 (오버라이딩)");
	}
	
	
}

class Sub2 extends Sub1 {
	int c;
	void m3() {
		System.out.println("m3-> Sub2");
	}
	
	@Override
	void m1() {
		// TODO Auto-generated method stub
		super.m1();
		System.out.println("m1() -> 오버라이드 메서드 (오버라이딩)");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		super.m2();
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		//다형성 (polymorphism)
		Parent p1 = new Parent();
		p1.a=10;
		p1.m1();
		
		p1=new Sub1();
		p1.a=100;
		p1.m1();
		
		p1=new Sub2();
		p1.a=300;
		p1.m1();
		
		Parent p2 = new Sub2();
		p2.a=100;
		p2.m1();
		
		Sub1 s1 = new Sub2();
		s1.a=100;
		s1.m1();
		
		s1.b=200;
		s1.m2();
		
		Sub2 s2 = new Sub2();
		s2.a=100;
		s2.b=200;
		s2.c=300;
		
		s2.m1();
		s2.m2();
		s2.m3();
	}

	
}
