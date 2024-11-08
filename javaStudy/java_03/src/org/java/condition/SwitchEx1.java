package org.java.condition;

public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("switch");
		int key = 1;
		switch (key) {
		case 1, 10:	
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
			break;
		case 3: 
			System.out.println(3);
			break;
		default :
			System.out.println("1,2,3을 제외한 정수 입니다.");
		}
	}
}
