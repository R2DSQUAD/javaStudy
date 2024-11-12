package org.java.javaapi;

public class WrapperEx5 {
	public static void main(String[] args) {
		System.out.println("Wrapper");
		int num1 = 100;
		Integer i= 100;
		
		
		
		System.out.println(Integer.toBinaryString(num1)); 	//int -> 2진수 String
		System.out.println(Integer.bitCount(num1));		  	//int -> 2진수 변환 후 1의 개수
		System.out.println(Integer.toHexString(num1));		//16진수 64
		System.out.println(Integer.toOctalString(num1));	//8진수 144
		
		String str="100";
		System.out.println(str.equals(100));
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(str)==100);
		
		Long id=1L;
		System.out.println();
		System.out.println(Integer.toString(num1)+100);
		System.out.println(Integer.toString(105));
		
		
	}
}
