//package org.java.io;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//public class IoBasicEx1 {
//	public static void main(String[] args) {
//		System.out.println("IO");
//		InputStream inStream = System.in;
//		try {
//			int inData=inStream.read(); //byte -> int
//			
//			System.out.println("입력 데이터: "+inData);
//			System.out.println("출력(문자) 데이터: "+(char)inData);
//			
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//			finally {
//				try {
//					inStream.close();
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
