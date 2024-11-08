package org.java.oop;

class P1 {
	int a;
	void m1() {
		System.out.println("m1 -> P1");
	}
}

class U1 extends P1 {
	int b;
	void m2() {
		System.out.println("m2 -> U1");
	}
}

class U2 extends U1 {
	int c;
	void m3() {
		System.out.println("m3 -> U2");
	}
}

public class PolymorphismEx {
	public static void main(String[] args) {
		P1 p1 = new P1();
		p1.a=10;
		p1.m1();
		System.out.println();
		
		P1 p2 = new P1();
		p2.a=100;
		
		p2 = new U1();
		p2.a=300;
		
		p2 = new U2();
		p2.a=300;
		
		P1 p21 = new U2();
		U1 p12 = new U2();
	
		
		
		U1 u1 = new U1();
		u1.a=20;
		u1.b=20;
		u1.m1();
		u1.m2();
		System.out.println();
		
		U2 u2 = new U2();
		u2.a=100;
		u2.b=200;
		u2.c=300;
		u2.m1();
		u2.m2();
		u2.m3();
		System.out.println();
	}
}
