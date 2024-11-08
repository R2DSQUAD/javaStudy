package org.java.array;

public class ArrayEx4 {
	public static void main(String[] args) {
		System.out.println("다차원 배열");
		int[][] arrInt = new int[4][3];
//		System.out.println(arrInt);
//		System.out.println(arrInt[0]); //0행
//		System.out.println(arrInt[1]); //1행
//		System.out.println(arrInt[2]); //2행
//		System.out.println(arrInt[3]); //3행
//		
//		arrInt[0][0]=10;
////		System.out.println(arrInt[0][0]);
//		System.out.println(arrInt.length);
//		System.out.println(arrInt[0].length);
		
		System.out.println();
		
		int num=1;
		
		for(int i=0; i<arrInt.length; i++) {
//			System.out.println(arrInt[i]+" "+arrInt[i].length);
			for(int j=0; j<arrInt[i].length; j++) {
				arrInt[i][j] = num;
				num++;;
				System.out.print(arrInt[i][j]+" ");
			}
			System.out.println();
		}
	}
}
