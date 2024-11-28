package org.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MemberList{
	static List<String> members() {
		List<String> list = new ArrayList<String>();
		return list;
	}
}

public class StreamEx3 {
	public static void main(String[] args) {
		System.out.println("Stream");
		
		List<String> list = new ArrayList<String>();
		list.add("m1");
		list.add("a1");
		list.add("ca1");
		list.add("ta1");
		list.add("r1");
		System.out.println();
		
		//1. Stream
		Stream<String> stream1 = list.stream();
		//2. 출력
//		stream1.forEach(el-> System.out.print(el+" "));
//		System.out.println();
//		stream1.forEach(el->{System.out.print(el+ " ");});
//		System.out.println();
//		stream1.forEach(System.out::println);
		System.out.println();
		
		//3. 필터링
		
	
//		List<String> list2 = stream1.filter(el-> el.contains("a")).collect(Collextor));
		
		//4. map
//		Stream.<String> stream3 = list.stream();
//		Stream.stream3 = stream3.map(el->el.concat("a").collect(Collectors.toLost());
//		
//		List<Stirng> list3 = steam1.filter(el -> el.containis("a"))
//				.map(el-> el.toUpperCase())
//				.collect(Collector.toList())	
//				.forEach(System.out::println);
		}
}
