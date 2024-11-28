package org.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderEx2 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Administrator\\Desktop\\fileReader\\test.txt";
		File file = new File(fileName);
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			int reData = 0;
			while((reData = fileReader.read()) != -1) {
				System.out.print((char)reData);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("파일 존재 X");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}