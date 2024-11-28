package org.java.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoBasicEx2 {
	public static void main(String[] args) {
		System.out.println("IO");
		InputStreamReader iReader = null;
		int inData =0;
		try {
			while(true) {
				iReader = new InputStreamReader(System.in);
				System.out.println("데이터 입력-> ");
				inData = iReader.read(); //입력 값을 -> byte -> int
				if(inData == -1) {
					System.out.println("while문 종료");
					break;
				}else {
					System.out.println("입력 데이터: " + inData);
					System.out.println("출력(문자)데이터: " +(char) inData);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				iReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
