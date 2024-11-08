package org.java.oop;

final class FinalClassEx {
	public void f1() {
		System.out.println("final 클래스");
	}
}

class A1 {
	int a;
}

class A2 {
	int b;
}

public class ConstructEx {
	private int num1;
	private int num2;
	private String name;
	
	public ConstructEx() {
//		super(); //무조건 첫번째 줄
		this(100);
		System.out.println("기본 생성자");
	}
	
	public ConstructEx(int num1) {
		this.num1=num1;
		System.out.println("ConstructEx(int num1)");
	}
	
	public ConstructEx(int num1, int num2) {
		this.num1=num1;
		this.num1=num2;
		System.out.println("ConstructEx(int num1, int num2)");
	}

	public ConstructEx(int num1, int num2, String name) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.name = name;
		System.out.println("ConstructEx(int num1, int num2, String name)");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
