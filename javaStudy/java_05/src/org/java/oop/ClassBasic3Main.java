package org.java.oop;

public class ClassBasic3Main {
	public static void main(String[] args) {
		//클래스 멤버
		ClassBasic3 cb = new ClassBasic3();
		cb.num1 = 123;
		cb.num2 = 321;
		cb.num3 = "123";
		cb.defaultNum = 321;
		
		System.out.println(cb.num1);
		System.out.println(cb.num2);
		System.out.println(cb.num3);
		System.out.println(cb.defaultNum);
		System.out.println(cb.toString());
		
		System.out.println(cb.MAX_MIN);
		
		cb.instanceMethod();
		cb.staticMethod();
	}
}
