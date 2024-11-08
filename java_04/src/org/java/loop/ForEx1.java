package org.java.loop;

public class ForEx1 {
public static void main(String[] args) {
	System.out.println("for");
	// 1~10 콘솔에 출력
	
	for(int i=0; i<10; i++) {
		if(i==9) {
			System.out.print(i+1);
//			break;
			continue;
		}
			System.out.print(i+1+",");
			System.out.println();
	}
}
}
