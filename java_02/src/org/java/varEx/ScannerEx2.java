package org.java.varEx;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = scn.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = scn.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		
		System.out.println("평균 : "+((num1+num2)/(double)2));
		scn.close();
	}
}
