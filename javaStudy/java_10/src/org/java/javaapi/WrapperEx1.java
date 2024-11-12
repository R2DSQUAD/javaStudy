package org.java.javaapi;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx1 {
	public static void main(String[] args) {
		System.out.println("Wrapper");
		
		// 기본 자료형 (primitive type)-> 객체형
		
		//정수형
		byte b=10;
		short s=10;
		int i=10;
		long l=10;
		
		//실수형
		float f=1.0f;
		double d=1.01;
		
		//문자형
		char ch='a';
		
		//논리형
		boolean bool = false;
		
		System.out.println("Wrapper");
		
		// boxing -> 기본 자료형 -> 객체형
		Byte b2 = new Byte(b);
		System.out.println(b2);
		Short s2 = new Short(s);
		System.out.println(s2);
		Integer i2 = new Integer(i);
		System.out.println(i2);
		Long l2 = new Long(l);
		System.out.println(l2);
		
		Float f2 = new Float(f);
		System.out.println(f2);
		Double d2 = new Double(d);
		System.out.println(d2);
		
		Character ch2 = new Character(ch);
		System.out.println(ch2);
		Boolean bool2 = new Boolean(bool);
		System.out.println(bool2);
		
		System.out.println(i==i2);
		System.out.println(i2.equals(i));
		
		System.out.println("컬렉션 프레임워크");
//		List<Integer> list = new ArrayList()<Integer>();
		
		
		
	}
}
