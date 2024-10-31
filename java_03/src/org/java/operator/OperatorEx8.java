package org.java.operator;

public class OperatorEx8 {
	public static void main(String[] args) {
		System.out.println("증감 연산자");
		int i=10;
		System.out.println(i++); //10
		System.out.println(i);	//11
		
		System.out.println(++i); //12
		System.out.println(i);	//12
		
		System.out.println(i--); //12
		System.out.println(i);	//11
		
		System.out.println(--i); //10
		System.out.println(i);	//10
		
		
		//반복문 -> for
//		for(int i2=0; i2<10; i2++) {
		for(int i2=0; i2<10; i2++) {
			System.out.println(12+1+" ");
			//조건문 if(사용) -> 1~5까지만 콘솔에 출력
			break;
		}
	}
}
