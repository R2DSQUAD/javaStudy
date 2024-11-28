package org.java.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		System.out.println("Vector");
		
		Vector<Integer> v1 = new Vector<Integer>(); 
		List<Integer> v2 = new Vector<Integer>(); 
		//1. 추가
		v2.add(new Integer(200));	//컬렉션 new, 클래스타입 타입변수 = new
		Integer i1 = new Integer(200);
		v2.add(i1);
		v2.add(300);	//자동 박싱
		v2.add(400);
		v2.add(500);
		
		// 2. 조회 모든 요소
		
		//for
		for (int i = 0; i<v2.size(); i++) {
			System.out.print(v2.get(i)+ " ");
		}
		System.out.println("for");
		System.out.println();
		
		//forEach 
		for (Integer i : v2) {
			System.out.print(i+" ");
		}
		System.out.println("forEach");
		System.out.println();
		
		//iterator
		Iterator<Integer> iterator = v2.iterator();
		while(iterator.hasNext()) {
			Integer i2 = iterator.next();
			System.out.print(i2+ " ");
		}
		System.out.println("iterator");
		System.out.println();
		
		//Stream -> DTO -> Entity, Entity -> DTO
		
//		v2.stream().map().collect()
		
		System.out.println();
		
		v2.add(0,500);
		System.out.println(v2);
		
		v1.add(1000);
		System.out.println(v1);
		
		v2.addAll(v1);
		System.out.println(v2);
		v1.clear();
		System.out.println(v1);
		
		System.out.println(v2);
//		System.out.println(v2.contains(new Integer(1000)));
		System.out.println(v2.contains(1000));
		
		//DB데이터 조회 -> NULL
		if(v1.isEmpty()) {
			System.out.println("조회할 데이터가 없습니다.");
		}
		
		System.out.println(v2);
		v2.remove(0);
		System.out.println(v2);
	}
}
