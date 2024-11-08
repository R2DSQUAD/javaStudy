package org.java.oop;

public class ConstruceEx {
	private int num1;
	private int num2;
	private Operator opearator;
	
	public ConstruceEx() {
	}
	
	public ConstruceEx(int num1, int num2, Operator opearator) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.opearator = opearator;
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

	public Operator getOpearator() {
		return opearator;
	}

	public void setOpearator(Operator opearator) {
		this.opearator = opearator;
	}
	
}
