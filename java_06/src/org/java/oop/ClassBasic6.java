package org.java.oop;


import org.java.common.*;

//접근지정자
public class ClassBasic6 {
	public static void main(String[] args) {
		A a = new A();
		a.a = 10;		//public
		a.b = 200;		//같은
		a.c = 300;		//상속, 같은
//		a.d;			//private
		
		a.setDdata(1000);
		int ddata = a.getDdata();
		System.out.println(ddata);
		
		B b = new B();
		b.a = 10;		//public
		b.b = 200;		//같은
		b.c = 300;		//상속, 같은
		
		//다른 패키지
		
		C c = new C();
		c.a = 1000;		//public
//		c.b = 200;		//같은
//		c.c = 300;		//상속, 같은
		
//		D d = new D();
	}
}
