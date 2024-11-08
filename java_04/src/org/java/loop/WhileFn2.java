package org.java.loop;

public class WhileFn2 {
	public static void main(String[] args) {
		System.out.println("while");
		
//		int i=0;
//		
//		while (i<=100) {		
//			//조건 식이 true면 실행				
//			if(i%2 == 0) {
//				if(i==100) {
//					System.out.print(i);
//					break;
//				}
//				System.out.print(i +", ");
//			}
//			i++;
//		}
		
		int i=2;
		while (i<10) {
			int j=1;
			while (j<10) {
				System.out.println(i+"x"+j+"="+i*j);
				j++;
			}
			i++;	
		}
	}
}
