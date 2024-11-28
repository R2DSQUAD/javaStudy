//package org.java.io;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class IOEx4 {
//	public static void main(String[] args) {
//		System.out.println("IO");
//		
//		String fileName="‪C:\\Windows\\system.ini";
//		Stirng fileNam=e.printStackTrace();a
//		
//		//파일 읽기
//		FileInputStream fileInputStream = null;
//		
//		try {
//			fileInputStream = new FileInputStream(fileName);
//			
//			int reData=0;
//			
//			while((reData = fileInputStream.read())!= -1) {
//				System.out.println());
//			}
//		}catch(FileNotFoundException e) {
//			System.out.println("파일이 존재하지 않습니다.");
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				fileInputStream.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//	}
//}
//;