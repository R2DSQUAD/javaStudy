package org.java.oop;

public class ClassBasicMain {
	public static void main(String[] args) {
		ClassBasic c1 = new ClassBasic();
		c1.name="c1_name";
		c1.num1=100;
		c1.num2=200;
		c1.instanceMethod();
		
		System.out.println(c1.name);
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		
		System.out.println(c1.getClass()+" << class");
		
		ClassBasic c2 = new ClassBasic();
		c2.name="c1_name";
		c2.num1=100;
		c2.num2=200;
		c2.instanceMethod();
		
		System.out.println(c2.name);
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		
		System.out.println(c2.getClass()+" << class");
		System.out.println(c2.getClass()==c1.getClass());
		System.out.println(c1==c2);
		
		ClassBasic.staticNUM = 100;
		System.out.println(ClassBasic. MAXNUM);
		
		System.out.println(Math.PI);
	}
}

