//package org.java.io;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class IOEx3 {
//	public static void main(String[] args) {
//		System.out.println("IO");
//		
//		InputStreamReader reader = null;
//		
//		int rs=0; // -1 -> ctrl+z
//		
//
//		
//		try {
//			while(true) {
////				BufferedReader bReader = new BufferedReader(reader);\
////				bReader.read();
//				System.out.println("숫자 입력(ctrl+z 시 종료): ");
//				reader = new InputStreamReader(System.in);
//				int num = reader.read();
//				System.out.println("num -> " + num);
//				
//				if(num==-1) {
//					System.out.println("종료");
//					break;
//					
//				}
//				rs+=num;	// 누적 숫자 값
//				
//			}
//			System.out.println("누적 숫자 값 -> " + rs);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			reader.close();
//		}
//		
//	}
//}
