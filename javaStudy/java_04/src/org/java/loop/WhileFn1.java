package org.java.loop;

public class WhileFn1 {
	public static void main(String[] args) {
		System.out.println("while");
		
		int i=0;
		
		while (i<100) {
			System.out.println("i-> "+i+" << ");
			//조건 식이 true면 실행
			i++;
			if(i==10) {
				System.out.print(i);
				continue;
			}
			System.out.print(i +", /");
		}
	}
}
