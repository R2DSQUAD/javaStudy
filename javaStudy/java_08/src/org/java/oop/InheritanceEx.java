//package org.java.oop;
//
//class Parent extends Object {
//	int a;
//	
//	public Parrent() {
//		this(10);
//		System.out.println("기본 생성자");
//	}
//	
//	public Parrent(int a) {
//		this.a=a;
//	}
//	
//	void m1() {
//		System.out.println("m1() -> Parent");
//	}
//}
//
//class Sub1 extends Parent {
//	int b;
//	public Sub1() {
//		super();
//	}
//	void m2() {
//		System.out.println("m2() -> Sub1;");
//		
//	}
//}
//
//
//class Sub2 extends Sub1 {
//	int c;
//	public Sub2() {
//		super(10);
//	}
//	void m3() {
//		System.out.println("m3() -> Sub1");
//		
//	}
//	
//	@Override
//	void m1() {
//		System.out.println("m1() -> 오버라이딩 Sub2");
//	}
//	
//	@Override
//	void m2() {
//		System.out.println("m2() -> 오버라이딩 Sub2");
//	}
//}
//
//public class InheritanceEx {
//	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		p1.a=10;
//		p1.m1();
//		
//		p1.new Sub1();
//		p1.a=20;
//		p1.m1();
//	}
//	
//	Sub2 s2=new Sub2();
//	s2.p1.a=10;
//	s2.m1();
//	s2.m2();
//	s2.m3
//	
//	
//}
