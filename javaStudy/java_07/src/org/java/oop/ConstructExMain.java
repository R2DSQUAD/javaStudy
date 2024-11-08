package org.java.oop;

public class ConstructExMain {
	public static void main(String[] args) {
		ConstructEx c1 = new ConstructEx();
		
		System.out.println();
		System.out.println(c1.getNum1());
		System.out.println(c1.toString());
		
		System.out.println();
		ConstructEx c2 = new ConstructEx(200);
		System.out.println(c2.toString());
		
		System.out.println();
		ConstructEx c3 = new ConstructEx(200, 300);
		System.out.println(c3.toString());
		
		System.out.println();
		ConstructEx c4 = new ConstructEx(500, 300, "c4");
		System.out.println(c4.toString());
		
		System.out.println(c1==c2);
		System.out.println(c1.getClass() ==c2.getClass());
		System.out.println();
		System.out.println(c1.getClass().getName());
		System.out.println(c2.getClass().getName());
		System.out.println(c3.getClass().getName());
		System.out.println(c4.getClass().getName());
	}
}
