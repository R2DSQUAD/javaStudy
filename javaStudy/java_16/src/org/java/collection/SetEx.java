package org.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		System.out.println("Set");
		
		//순서를 유지하지 않는 데이터 집합,ㅡ 데이터 중복을 허용안함 -> 주머니
		Set<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("SPRING");
		set.add("REACT");
		set.add("RDBMS");
		set.add("WAS");
		set.add("AWS");
		set.add("AWS");		//중복 값 허용 X
		set.add("AWS");		//중복 값 허용 X
		set.add("AWS");		//중복 값 허용 X
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str+ " ");
		}
		
		// 3. 삭제
		set.remove("JAVA");
		
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			String str = iterator2.next();
			System.out.print(str+ " ");
		}
		System.out.println();
		
		//4. 모두 삭제
		set.clear();
		
		
		System.out.println(set.size());
		
		if(set.isEmpty()) System.out.println("비어있다.");
		

	}
}
