package org.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRaeaderEx1 {
	public static void main(String[] args) {
		FileReader fileReader = null;
		String fileName = "C:\\test\\test.txt";
		File file = new File(fileName);
		
	try {
		fileReader= new FileReader(file);
		int reData=0;
		
		while ((reData = fileReader.read()) != -1) {
			System.out.println((char)reData);
		}
	
	}catch(FileNotFoundException e) {
		System.out.println("파일 존재 X");
		e.printStackTrace();
	}catch(IOException e){
		System.out.println("입출력 예외");
		e.printStackTrace();
	}finally {
		try {
			fileReader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	}

}
