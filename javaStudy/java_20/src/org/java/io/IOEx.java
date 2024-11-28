package org.java.io;

import java.util.Scanner;

public class IOEx {
	public static void main(String[] args) {
		System.out.println("IO");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		System.out.println(str);
		
		sc.close();
	}
}
