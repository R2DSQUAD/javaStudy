package org.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx1 {
	public static void main(String[] args) {
		System.out.println("IO");
		
		//콘솔에서 문자 입력
		String fileName = "C:\\Users\\Administrator\\Desktop\\fileReader\\test.txt";
		InputStreamReader iReader = new InputStreamReader(System.in);
		FileWriter fileWriter= null;
		
		try {
			fileWriter = new FileWriter(fileName);
			int reData =0;
			
			while((reData=iReader.read())!=1) {
				fileWriter.write(reData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
