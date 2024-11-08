package org.java.array;

import java.util.Stack;

public class ArrayEx2 {
	public static void main(String[] args) {
//		int[] arrInt = {};
		int[] arrInt = new int[5];
		
		System.out.println(arrInt);
		System.out.println(arrInt.length);
		
//		List<Integer> list = newArrayList<Integer>;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//push -> 컬렉션 프레임워크 Stack 마지막 요소 다음에 추가
		//pop -> 컬렉션 프레임워크 Stack 마지막 요소 삭제
		//javascript push(), pop() 있음
		
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i]=i+1;
			System.out.println(arrInt[i]);
		}
		
		char[] ch= new char[5];
		for(int i=0; i<ch.length; i++) {
			ch[i]=(char)(i+65);
			System.out.println(ch[i]);
		}
	}
}
