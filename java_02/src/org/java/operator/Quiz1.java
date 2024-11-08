package org.java.operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("==== 홀짝 ====");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요 : ");
		int num =  scn.nextInt();
		if (num>0) {
			if(num%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			if(num==0) {
				//제약조건 -> constrant
			}else
			System.out.println("입력하신 숫자는 자연수가 아닙니다.");
		}
		scn.close();
		//Scanner 종료 -> 사용중인 Scanner 메모리에서 제거
		//가바지 컬렉션 -> 사용하지 않는 메모리에서 제거
	}
}
