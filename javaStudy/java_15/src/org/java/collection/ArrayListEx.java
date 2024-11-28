package org.java.collection;

import java.util.Vector;

import javax.management.RuntimeErrorException;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	// ArrayList -> Vector -> 최신형 -> List 구현객체
	// -> Vector 메서드 -> 동일
	// -> Web -> 조회, 페이징, 대부분의 검색 기능에 사용
	// List<T> -> *****

	public static void main(String[] args) {

		System.out.println("ArrayList");
		// 1. 순서가 있다.
		// 2. 객체형 요소
		// 3. 데이터의 크기가 정해지지 않았다.

		Vector<Integer> v1 = new Vector<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		// 1. 추가
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);
		arr2.add(60);

		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(arr2);
		System.out.println(arr2.size());

//		arr2.clear();

		System.out.println(arr2);
		System.out.println(arr2.size());

		System.out.println(arr2.contains(10));

		//확장형 for문 (forEach)
		if (arr2.isEmpty()) {
			System.out.println("조회 데이터가 없습니다");
			try {
				throw new RuntimeException("조회 데이터가 없습니다");
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		} else {
//			return "조회데이터를 반환";
		}
		System.out.println("정상 실행");
		System.out.println(arr2);
		arr2.remove(0);
		System.out.println(arr2);
		
		//Iterator
		Iterator<Integer> iterator = arr2.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.print(i+" ");
		}
		System.out.println();
		
		//forEach -> List -> 요소 -> 조회
		arr2.forEach(element-> System.out.println(element+ " "));
		
		System.out.println();
		
		// ***** 메서드 참조 ::
		// 클래스::매서드 -> List 의 각 요소를 매개인자로 추가
		arr2.forEach(System.out::print);
		System.out.println();
		
		arr2.forEach(el -> {
			MethodSub m2 = new MethodSub();
			m2.m1(el);
		});
		
		System.out.println();
		
		arr2.forEach(MethodSub::m1);
	}
}
