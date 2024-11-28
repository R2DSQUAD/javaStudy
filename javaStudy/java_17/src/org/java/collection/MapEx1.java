package org.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		System.err.println("Map<K,V>");
		Map<Integer, String> map = new HashMap<Integer, String>();

		// 1. 추가
		map.put(1, "JAVA");
		map.put(2, "SPRING");
		map.put(3, "JDBC");
		map.put(4, "SECURITY");
		map.put(5, "JPA");

		// 2. 조회
		String s1 = map.get(1);
		String s2 = map.get(2);
		String s3 = map.get(3);
		String s4 = map.get(4);
		String s5 = map.get(5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		System.out.println();

		Set<Integer> set = map.keySet();
		
		Iterator<Integer> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Integer keyStr = iterator.next();
			map.get(keyStr);
			System.out.print(map.get(keyStr)+ " ");
		}
	}
}
