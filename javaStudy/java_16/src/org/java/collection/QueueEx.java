package org.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		System.out.println("Queue");
	
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//추가
//		queue.add(10);
//		queue.add(20);
//		queue.add(30);
//		queue.add(40);
//		queue.add(50);
//		System.out.println(queue);
//		System.out.println(queue.peek());	//가장 처음 요소
//		System.out.println(queue);
		
		//제거
		System.out.println(queue.poll());	//가장 처음 요소 제거
		System.out.println(queue);
		
		for (int i=1; i<=100; i++) {
			queue.add(i);
		}
		
		for (int i=1; i<100; i++) {
			System.out.print(queue.poll() + ", ");
		}
		System.out.print(queue.poll());
	}
}
