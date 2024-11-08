package org.java.oop;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		//private 멤버(필드) 초기화
		cal1.setNum1(100);
		cal1.setNum2(200);
		cal1.setOp("+");
		cal1.setSum(1000);
		cal1.setAvg(20.0);
		
		//private 멤버(필드) 조회; -> getter
		int num1 =cal1.getNum1();
		int num2 =cal1.getNum2();
		String op =cal1.getOp();
		int sum =cal1.getSum();
		double avg =cal1.getAvg();
		
		System.out.println(num1);	//숫자
		System.out.println(num2);	//숫자
		System.out.println(op);		//문자
		System.out.println(sum);	//숫자
		System.out.println(avg);	//숫자
		
		//오버로딩
		System.out.println();
		
		//생성자 오버로딩
		Calculator c2 = new Calculator(num1, num2, "+");
		System.out.println(c2.getNum1());
		System.out.println(c2.getNum2());
		System.out.println(c2.getOp());
		}
}
