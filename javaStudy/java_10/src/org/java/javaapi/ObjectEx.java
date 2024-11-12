package org.java.javaapi;

class A {
	void a1() {
		System.out.println("a1");
	}
}

class B {
	void b1() {
		System.out.println("b1");
	}
	
}

public class ObjectEx {
	public static void main(String[] args) {
		//1. Object -> 모든 클래스의 부모 클래스
		//2. Object -> 모든 클래스의 Object 메서드 상속 받는다.
		
		A a1 = new A();
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.toString());
		
		System.out.println();
		
		B b1 = new B();
		System.out.println("b1-> hashCode: "+ b1.hashCode());
		System.out.println(b1.toString());
		
		System.out.println("b1 -> hash");
		
		System.out.println(b1.hashCode() == a1.hashCode());
		System.out.println(b1.getClass().equals(a1.getClass()));
		System.out.println(b1.equals(a1));
		
		B b2 = new B();
		System.out.println(b2.getClass().equals(b1.getClass()));
	}
}
