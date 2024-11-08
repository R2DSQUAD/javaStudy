package org.java.loop;

public class DoWhileEx1 {
	public static void main(String[] args) {
		System.out.println("do~while");
		
		//for문의 구현부가 실행 X 에러 X
		for(int i=0; i>10; i--) {
			System.out.println(i);
		}
		
		int j=0;
		while(j>10) {
			j++;
			System.out.println(j);
		}
		
		int h=0;
		do {
			h++;
			System.out.println(h);
		}while(h>10);
		
	}
}
