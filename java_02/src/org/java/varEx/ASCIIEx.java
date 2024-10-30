package org.java.varEx;

public class ASCIIEx {
	public static void main(String[] args) {
		System.out.println("아스키코드");
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println(ch1+32);
		System.out.println((char)(ch1+32));
		
		int i1= 'A';
		System.out.println(i1);
		System.out.println(i1+32);
		System.out.println((char)(i1+32));
		
		int i2 = 'a';
		System.out.println(i2);
		System.out.println(i2-32);
		System.out.println((char)(i2-32));
		
		System.out.println("대문자 + 32 -> 소문자");
		System.out.println((char)('A'+32));
		System.out.println((char)('B'+32));
		System.out.println((char)('Z'+32));
		
		System.out.println("소문자 - 32 -> 대문자");
		System.out.println((char)('a'-32));
		System.out.println((char)('b'-32));
		System.out.println((char)('z'-32));
		
		//
//		for(int i=65; i<=90; i++) {
//			System.out.println((char)i+"->"+(char)(i+32));
//		}
//		for(int i='A'; i<='Z'; i++) {
//			System.out.println((char)i+"->"+(char)(i+32));
//		}
		
		for(int i='A'; i<='Z'; i++) {
		System.out.print((char)i+"->"+(char)(i+32)+"  ");
	}
		
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i+"->"+(char)(i-32)+"  ");
		}
		
		System.out.println();
		System.out.printf("숫자1 %d, 숫자2 %d",10,300);
	}
}
