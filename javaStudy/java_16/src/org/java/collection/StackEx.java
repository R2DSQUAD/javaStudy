package org.java.collection;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		System.out.println("Stack");
		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(100);
//		stack.push(200);
//		stack.push(300);
//		stack.push(400);
//		stack.push(500);
//		System.out.println(stack);
//		System.out.println(stack.peek());			// 가장 마지막 요소 조회
//		System.out.println(stack.search(200));		//마지막 요소 -> 처음 요소
//		System.out.println(stack.isEmpty());		
//		System.out.println(stack.pop());			//가장 마지막 요소 제거
//		System.out.println(stack);		
		
		for (int i=0; i<100; i++) {
			stack.push(i);
			
		}
		System.out.println(stack);
		
		for (int i= 0; i<100; i++) {
			System.err.print(stack.pop() + " ");
		}
	}
}
