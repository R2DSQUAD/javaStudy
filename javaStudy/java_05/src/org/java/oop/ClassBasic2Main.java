package org.java.oop;

public class ClassBasic2Main {
	public static void main(String[] args) {
		ClassBasic c1 = new ClassBasic();
		c1.name="c1_name";
		c1.num1=100;
		c1.num2=200;
		
		System.out.println(c1.name+", "+ (c1.num1+c1.num2));
		ClassBasic2 c2 = new ClassBasic2();
		c2.name="c2_Name";
		c2.num1=200;
		c2.num2=111;
		
	}
}
