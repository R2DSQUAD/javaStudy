package org.java.javaapi;

public class WrapperEx2 {
	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("Wrapper -> 기본 자료형");
		//언박싱
		
		//언방식 -> 객체 -> 기본 자료형
		Byte b = new Byte((byte)10);		//int -> byte
		
		//언박싱
		b.byteValue();		
		Short s = new Short((short)10);		//int -> short
		s.shortValue();
		Integer i = new Integer(10);
		i.intValue();
		Long l = new Long(10);
		l.longValue();
		Float f= new Float(10);
		f.floatValue();
		Double d = new Double(10);
		d.doubleValue();
		Character ch = new Character('a');
		ch.charValue();
		Boolean bool = new Boolean(false);
		bool.booleanValue();
//		
//		System.out.println(b+", "+b2);
//		System.out.println(s+", "+s2);
//		System.out.println(i+", "+i2);
//		System.out.println(l+", "+l2);
//		System.out.println(f+", "+f2);
//		System.out.println(d+", "+d2);
//		System.out.println(ch+", "+ch2);
//		System.out.println(bool+", "+bool2);
	}
}
