package org.java.loop;

import java.util.Scanner;

public class ForEx_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = scn.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = scn.nextInt();
		
		if (num1 <= num2) {
			for(int i=num1; num1<=num2; i++) {
				if(i == num2) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
			}
		}else {
			System.out.println("첫번째 숫자는 반드시 두번째 숫자보다 작아야한다.");
		}
		scn.close();
		
	}
}
