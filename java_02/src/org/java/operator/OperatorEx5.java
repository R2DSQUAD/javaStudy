package org.java.operator;

public class OperatorEx5 {
	public static void main(String[] args) {	
		System.out.println("대입 연산자, 복합 대입 연산자");
		
		//대입 연산 -> 오른쪽의 연산 결과를 왼쪽 변수에 대입, 연산의 마지막에 설정
		int sum =(100+50)-30+200/4;
		
		int num1=100;
		num1=num1+100;
		System.out.println(num1);
		
		num1+=100;
		System.out.println(num1);
		num1-=100;
		System.out.println(num1);
		num1*=100;
		System.out.println(num1);
		num1/=100;
		System.out.println(num1);
		num1%=100;
		System.out.println(num1);
	}
}
