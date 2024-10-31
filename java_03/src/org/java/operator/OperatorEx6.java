package org.java.operator;

public class OperatorEx6 {
	public static void main(String[] args) {
		System.out.println("비트 연산자");
		System.out.println("&");
		System.out.println(12&5);
//		12는 1100
//		 5는 0101
//			 0100
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12+5));
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5)+"->"+Integer.toBinaryString(12&5));
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12|5));
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5)+"->"+Integer.toBinaryString(12|5));
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12^5));
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5)+"->"+Integer.toBinaryString(12^5));
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12+5));
		System.out.println(Integer.toBinaryString(12)+"~"+Integer.toBinaryString(5)+"->"+Integer.toBinaryString(~5));
	}
}
