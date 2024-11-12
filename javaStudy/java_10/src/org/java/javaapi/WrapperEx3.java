package org.java.javaapi;

public class WrapperEx3 {
	public static void main(String[] args) {
		System.out.println("자동박싱 -> 기본자료형 -> 객체형");

		// 기본 자료형 (primitive type)-> 객체형

		// 정수형
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;

		// 실수형
		float f = 1.0f;
		double d = 1.01;

		// 문자형
		char ch = 'a';

		// 논리형
		boolean bool = false;
		
		//자동박싱
		Byte b2= b;
		Short s2=s;
		Integer i2=i;
		Long l2=l;
		Float f2=f;
		Double d2=d;
		Character ch2=ch;
		Boolean bool2= bool;
		
		System.out.println(b+", "+b2);
		System.out.println(s+", "+s2);
		System.out.println(i+", "+i2);
		System.out.println(l+", "+l2);
		System.out.println(f+", "+f2);
		System.out.println(d+", "+d2);
		System.out.println(ch+", "+ch2);
		System.out.println(bool+", "+bool2);
	}
}
