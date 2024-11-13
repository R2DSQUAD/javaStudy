package org.java.javautil;

public class MathEx2_Lotto {
	public static void main(String[] args) {
		System.out.println("Math->lotto");
		
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=i+1;
//			System.out.print(lotto[i]+" ");
		}
		
		int temp=0;
		
		for (int i=0;i<1000;i++) {
			int idx = (int)(Math.random()*45);
			
			//랜덤 수를 이용해 자리 바꿈
			temp = lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=temp;
		}
		
		for (int i=0; i<6; i++) {
			if(i>=5) {
				System.out.println(lotto[i]);
				break;
			}
			System.out.print(lotto[i]+", ");
		}
	}
}