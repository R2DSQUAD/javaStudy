package org.java.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println("Exception");
		int[] arrInt = new int[5];
		
		try {
			for(int i=0; i<6; i++) {
				arrInt[i]=i+10;
				System.out.println(i+"-> "+arrInt[i]+" ");
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}		
		finally {
			System.out.println("기본 실행!");
		}
		System.out.println("정살 실행");
	}
}
