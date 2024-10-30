package org.java.varEx;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		//대문자로 입력해서 소문자로 변경 A -> a
		//nextInt()
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("대문자(A~Z-> 65~90) 입력: ");
		int upper=scn.nextInt();
//		System.out.println((char)upper);
		System.out.println(upper+"->"+((char)upper));
		
		int low=upper+32;
		
		System.out.println(low+"->"+((char)low));
		scn.close();
	}
}

