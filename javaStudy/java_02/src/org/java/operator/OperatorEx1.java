package org.java.operator;

import java.util.Scanner;

public class OperatorEx1 {
	public static void main(String[] args) {
		System.out.println("산술연산자(+=*/%)");
		
//		int num1 = 55;
//		int num2 = 3;
//		
//		System.out.println(num1+"+"+num2+"="+(num1+num2));
//		System.out.println(num1+"-"+num2+"="+(num1-num2));
//		System.out.println(num1+"*"+num2+"="+(num1*num2));
//		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
//		System.out.println(num1+"%"+num2+"="+(num1%num2));
		
		Scanner scn = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = scn.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = scn.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(Math.round((num1/(double)num2)*1000)/1000.0));
		System.out.println(num1+"/"+num2+"="+(Math.round((num1/(double)num2)*1000)));
		System.out.printf("%d/%d=%.3f\n",num1, num2, num1/(double)num2);
		String result = String.format("%.3f", num1/(double)num2);
		System.out.println(result);
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		scn.close();
	}
}
