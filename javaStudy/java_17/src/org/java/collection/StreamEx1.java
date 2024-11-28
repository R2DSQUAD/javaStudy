package org.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		System.out.println("Stream");
		//배열
		String[] strArr = {"java", "oracle", "mysql", "servlet", "spring"};
		//배열 -> List 변경
		List<String> strArrList = Arrays.asList(strArr);
		//조회
		for (String str: strArrList){
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("정렬 후 원본 데이터를 변경");
		
		// 배열 정렬
		Arrays.sort(strArr); // 원본 배열이 정렬됨
		for (String str : strArr) {
		    System.out.print(str + " ");
		}
		System.out.println();

		// 컬렉션 정렬
		Collections.sort(strArrList); // 원본 리스트가 정렬됨
		for (String str : strArrList) {
		    System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("=====Array=====");
		System.out.println("Stream ->");
		
		//배열 정렬
		Arrays.sort(strArr);			//java, oracle, mysql, servlet, spring
		//컬렉션 정렬
		Collections.sort(strArrList);	//java, oracle, mysql, servlet, spring
		
		String[] strArr2 = {"java", "oracle", "mysql", "servlet", "spring"};
		List<String> strArrList2 = Arrays.asList(strArr);
		
		Stream<String> stream1 = Arrays.stream(strArr2);	//배열 -> Stream
		Stream<String> stream2 = strArrList2.stream();		//List -> Stream
		
		stream1.sorted().forEach(el-> System.out.println(el));
		
		System.out.println("=====List=====");
		
		stream2.sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("정렬 후 원본 데이터가 변경이 안된다.");
		
		for (String str : strArrList2) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr2) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
	}
}
