package org.java.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionEx1 {
	public static void main(String[] args) {
		System.out.println("List");
		//1~5 리스트
		
		List<Integer> list1 = new Vector<Integer>();
		System.out.println(list1);
		Integer i = new Integer(10);
		//추가
//		list1.add(new Integer(10));
		list1.add(10); //자동 BOXING
		list1.add(20); //중복 값 허용
		list1.add(20); //중복 값 허용
		list1.add(40); //중복 값 허용
		list1.add(50); //중복 값 허용
		
		System.out.println(list1);
		
		//출력
		Integer i2 = list1.get(0);
		System.out.println(i2);
		list1.add(1,100);
		System.out.println(list1);
		System.out.println(list1.size());
		List<Integer> list2 = new Vector<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		
//		list1.clear();
		System.out.println(list1.size());
		System.out.println(list1);
		
		Boolean bool = list1.contains(100);
		System.out.println(bool);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		System.out.println();
		
		// for
		for(int i3=0; i3<list1.size(); i3++) {
			System.out.print(list1.get(i3)+" ");
		}
		System.out.println();
		
		// forEach -> 
		// 타입 요소 : 컬렉션 -> 모든 요소를 조회
		for(Integer integer: list1) {
			System.out.print(integer+" ");
		}
		
		//직렬화 -> 일렬로 쭉
		Iterator<Integer> iterator=list1.iterator();
		//있으면
		while(iterator.hasNext()) {
			Integer el=iterator.next();
			System.out.println(el+" ");
		}
		
		System.out.println();
//		list1.clear();
		list1.isEmpty(); //Vector가 비었냐?
		if(list1.isEmpty()) {
			System.out.println("조회할 데이터가 없습니다.");
		}
		
		System.out.println();
		
//		list1.remove(100);
		System.out.println(list1);
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		Object [] arrOb= list1.toArray();
		System.out.println(arrOb[0]);
	}
}
