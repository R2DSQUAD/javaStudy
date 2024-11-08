package org.java.array;

public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println("배열");
		
		
		int[] arrInt = new int[5];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
			if (i >= arrInt.length - 1) {
				System.out.println(arrInt[i]);
				break;
			}
			System.out.println(arrInt[i] + ",");
		}
		
		System.out.println();
		
		int[] arrInt2 = new int[] { 0, 1, 2, 3, 4 };

		for (int i = 0; i < arrInt2.length; i++) {
			if (i >= arrInt2.length - 1) {
				System.out.println(arrInt2[i]);
				break;
			}
			System.out.println(arrInt2[i] + ",");
		}
		
		System.out.println();
		
		int[] arrInt3= {0,1,2,3,4};
		
		for (int i = 0; i < arrInt3.length; i++) {
			if (i >= arrInt3.length - 1) {
				System.out.println(arrInt3[i]);
				break;
			}
			System.out.println(arrInt3[i] + ",");
		}
		
		System.out.println();
		
		String[] arrStr= {"HTML", "CSS","JAVASCRPT","REACT","JAVA"};
		for (int i = 0; i < arrStr.length; i++) {
			if (i >= arrStr.length - 1) {
				System.out.println(arrStr[i]);
				break;
			}
			System.out.println(arrStr[i] + ",");
		}
		
		System.out.println();
		
		char[] arrCh = {'a', 'b', 'c', 'd','e'};
		System.out.println('a'+1);
		for (int i = 0; i < arrCh.length; i++) {
			if (i >= arrCh.length - 1) {
				System.out.println(arrCh[i]);
				break;
			}
			System.out.println(arrCh[i] + ",");
		}
		
		
		System.out.println("대문자 -> 소문자");
		for (int i = 'a'; i < 'z'; i++) {
			if (i >= arrCh.length - 1) {
				System.out.println((char)(i+32)+",");
				break;
			}
			System.out.println((char)(i+32));
		}
		
		System.out.println("소문자 -> 대문자");
		for (int i = 'A'; i < 'Z'; i++) {
			if (i >= arrCh.length - 1) {
				System.out.println((char)(i-32)+",");
				break;
			}
			System.out.println((char)(i-32));
		}
	}
}
