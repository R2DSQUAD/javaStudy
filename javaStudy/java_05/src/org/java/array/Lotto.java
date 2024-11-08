package org.java.array;

import java.net.MulticastSocket;

public class Lotto {
	public static void main(String[] args) {
		System.out.println("로또");
		
		int[] lotto = new int[45];
		
		//1~45 lotto 배열 초기화
		for(int i=0; i<45; i++) {
			lotto[i] = i+1;
			System.out.print(lotto[i]+"");
		}
		
		int temp = 0;
		for(int i=0; i<1000; i++){
			int index=(int)Math.random()*45;
			System.out.print( index);
			System.out.println();
			System.out.print( lotto[index]+"lotto");
			temp=lotto[index]; //랜덤한 인덱스 -> 배열의 값 -> temp에 저장
			lotto[index]=lotto[0];
			lotto[0]=temp;
		}
		System.out.println();
		
		//for -> 사용자가 원하는 개수 만큼
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();
		
		//객체형 for문
		for(int arr: lotto) {
			System.out.print(arr+" ");
		}
		System.out.println();
		
		System.out.println("=== lotto (6) === ");
		
		for(int i=0; i<6;i++) {
			System.out.print(lotto[i]);
		}
		
		//forEach -> 모든 배열의 요소를 조회
//		for(타입 변수: 배열) {
//			변수 (배열의 요소);
//		}
		
	}
}
//			System.out.print(int)(Math.random()*45));