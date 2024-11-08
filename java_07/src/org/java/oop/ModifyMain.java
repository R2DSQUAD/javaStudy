package org.java.oop;

import org.java.modify.A;

public class ModifyMain {
	public static void main(String[] args) {
		System.out.println("접근제한자");
		C c1=new C();
		c1.a=10;
		c1.b=20;
		c1.d=100;
		c1.setC(200);
		String c1Info=c1.toString();
		System.out.println(c1Info);
		
		D d1=new D();
		d1.a=10;
		d1.b=20;
		d1.d=30;
		d1.setC(40);
		String d1Info=d1.toString();
		System.out.println(d1Info);
		
		// 다른 패키지 import
		A a1 = new A();
		a1.a = 10;
		String a1Info = a1.toString();
		System.out.println(a1Info);
		}
	
//		new B()
}
