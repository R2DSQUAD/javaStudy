package org.java.varEx;

public class VarEx8 {
	public static void main(String[] args) {
		System.out.println("변수");
		
		/*
		 자바의 기본 타입

		1		2		4		8
		byte	short	int		long
						float	double
				char
		boolean		 
		 */
		
		byte b=10;
		short s=10;
		int i=10;
		long l=10;
		
		float f=1.1f;
		double d=1.1;
		
		char ch='a';
		boolean bool=false;
		
		/*
		 자바의 객체 타입(자료형) -> Object, 참조형 -> 주소 값을 이용해서 객체에 접근
		 class, interface, 배열, String 
		 */
		
		// t1 -> 객체 참조 변수 -> 생성된 객체 주소값 저장 변수
		// new -> 객체 생성 연산자
		/// t1 -> 객체, 인스턴스
		// TestClass -> 사용자 정의 타입 class
		 TestClass t1 = new TestClass();	
		 //객체 . -> 객체 접근 연산자
		 t1.num1=100;
		 t1.num2=200;
		 t1.instanceMethod();
		 
		 System.out.println(t1.num1);
		 System.out.println(t1.num2);
		 
		 System.out.println("========String========");
		 String str1 = new String("문자열1");
		 String str2 = new String("문자열1");
		 String str3 = ("문자열1");
		 String str4 = ("문자열1");
		 
		 //주소 값 비교
		 System.out.println(str1==str2);
		 System.out.println(str1==str3);
		 System.out.println(str3==str4);
		 
		 //값만 비교
		 System.out.println("========equals========");
		 System.out.println(str1.equals(str2));
		 System.out.println(str1.equals(str3));
		 System.out.println(str3.equals(str4));
	}
}
