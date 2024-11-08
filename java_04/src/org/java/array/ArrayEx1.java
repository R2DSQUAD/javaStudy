package org.java.array;

public class ArrayEx1 {
	public static void main(String[] args) {
		System.out.println("배열 -> []");
		
		int [] arrInt = new int [500];
		
//		arrInt[0]=10; //0번지
//		arrInt[1]=20; //1번지
//		arrInt[2]=30; //2번지
//		arrInt[3]=40; //3번지
//		arrInt[4]=50; //4번지
		
		for(int i=0; i<arrInt. length; i++)
		{
			arrInt[i]=10*i+10;
			System.out.println(arrInt[i]);
		}
		System.out.println(arrInt);
		System.out.println(arrInt.length);
		
		System.out.println();
		
		int[] arrInt2 = new int[] {10,20,30,40,50};
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
		
		System.out.println();
		
		
		int[] arrInt3 = {10,20,30,40,50};
		for (int i=0; i<arrInt3.length; i++) {
			System.out.println(arrInt3[i]);
		}
		
	}
}
