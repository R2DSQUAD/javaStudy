package org.java.javaapi;

public class WrapperEx4 {
	public static void main(String[] args) {
		System.out.println("자동 언박싱");
		
		//박싱 기본자료형 -> 객체형
		Byte b = 10; // int -> byte
		//언박싱
		byte b2 = b.byteValue();
		
		Short s = 10;
		short s2 = s.shortValue();
//		short s2 = s;
		
		Integer i = 10;
		int i2 = i.intValue();
//		int i2 = i;
		
		Long l = 10L;
		long l2 = l.longValue();
//		long l2 = l;
		
		Float f = 10.0f;
		float f2 = f.floatValue();
//		float f2 = f;
		
		Double d = 10.0;
		double d2 = d.doubleValue();
//		double d2 = d;
		
		Character ch = 'a';
		char ch2 = ch.charValue();
//		char ch2 = ch;
		
		Boolean bool = false;
		boolean bool2 = bool.booleanValue();
//		boolean bool2 = bool
	}
}
