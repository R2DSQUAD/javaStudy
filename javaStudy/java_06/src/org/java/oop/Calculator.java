package org.java.oop;

public class Calculator {
	private int num1;
	private int num2;
	private int sum;
	private double avg;
	private String op;
	
	// 매서드 오버로딩
	// 컴파일러가 자동으로 생성
	// 기본 생성자는 매개인자가 없는 생성자
	public Calculator() {
		System.out.println("기본 생성자");
	}
	
	public void m1() {}
	public void m1(int i) {}
	public void m1(String i) {}
	public void m1(String i, int j) {}
	public int m1(int i,String j ) {return 0;}
	
	public Calculator(int num1, int num2, String op) {
		this.num1=num1;
		this.num2=num2;
		this.op= op;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setOp(String op) {
		this.op = op;
	}
	
	public String getOp() {
		return op;
	}
	
}
