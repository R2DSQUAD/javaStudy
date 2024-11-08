package org.java.oop;

public class ClassBasic5 {
	public int num1;
	public int num2;
	public int sum;
	public double avg;
	public String op;
	
	//생성자 -> 오버로딩
	public ClassBasic5() {
		System.out.println("기본 생성자");
	}

	
	
	public ClassBasic5(int num1, int num2, String op) {		
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	
	//return X -> void
	public void m1() {
		System.out.println("m1매서드");
		return;
	}
	
	//return String
	public String m2(String op) {
		return op;
	}
	
	//retutn int
	public int m3 (int num1, int num2) {
		int sum = num1+ num2;
		return sum;
	}
	
	//retutn int
	public int m4(int num1, int num2, String op) {
		if (op.equals("+")) {
		return num1 + num2;
		}	else if(op.equals("-")) {
			return num1 - num2;
		}else if(op.equals("/")) {
			return num1 / num2;
		}
		else if(op.equals("*")) {
			return num1 * num2;
		}
		
		return 0;
	}
	
	//클래스 멤버
	public static String staticMethod() {
		
		return "static 매서드";
	}
	
	
	// 객체 정보 toString()
	@Override
	public String toString() {
		String result ="ClassBasic5 -> num1:" +this.num1+", num2: "+this.num2;
		return result;
	}
}
