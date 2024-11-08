package org.java.oop;

interface In1 {
//	public static final int MAX=1000;
	int MAX=1000;
	
	public abstract void ab1();
	public abstract int ab2();
	public abstract int ab3(int num1, int num2);
	
//	void ab1();
	 
	public TestDTO testDto();

	default void m1() {
		System.out.println("default -> m1");
	}
	
	public static void m2() {
		System.out.println("static -> m2");
	}
	
}

interface In2 extends In1 {}
class In1Sub implements  In1 {

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ab2() {
		System.out.println("ab2-> 오버라이딩");
		return 0;
	}
	
	@Override
	public int ab3(int num1, int num2) {
		System.out.println("ab3-> 오버라이딩");
		return num1+ num2;
	}

	@Override
	public TestDTO testDto() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class InterfaceEx {
	public static void main(String[] args) {
		In1Sub i1 = new In1Sub();
		i1.ab1();
		i1.ab2();
		i1.ab3(100, 200);
		System.out.println();
		
		In1 i2 = new In1Sub();
		i2.ab1();
		i2.ab2();
		i2.ab3(1000, 2000);
	}
}