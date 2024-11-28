package org.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		System.out.println("LinkedList");
		
		List <Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		list.forEach(el-> System.out.println(el));
		System.out.println("LinkedList =====");
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();		//강제성 O
//		LinkedList linkedList2 =new LinkedList();						//강제성 X
		
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		System.out.println(linkedList);
		
		linkedList.addFirst(600); 				//가장 앞 요소에 추가
		
		System.out.println(linkedList);
		
		linkedList.add(0,700);					//0번지에 값을 추가
		System.out.println(linkedList);
		
		linkedList.add(800);					//가장 마지막 요소에 추가
		System.out.println(linkedList);			
		
		linkedList.add(linkedList.size(), 900);	//가장 마지막 요소에 추가
		
		System.out.println(linkedList);		
		
		linkedList.removeFirst();				//가장 첫번째 요소 삭제
		
		System.out.println(linkedList);
		
		linkedList.remove(0);					//0번지 요소 삭제
		
		System.out.println(linkedList);
		
		linkedList.removeLast();					//가장 마지막 요소 삭제
		
		System.out.println(linkedList);
		
		linkedList.remove(linkedList.size()-1);		//가장 마지막 요소 삭제
		
		System.out.println(linkedList);
	}
}
