package org.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx2 {
	public static void main(String[] args) {

		System.out.println("IO");
		InputStreamReader inReader = null;
		String fileName = "C:\\test5.txt";
		File file = new File(fileName);
		FileWriter fWriter = null;
		FileReader fReader = null;
		try {
			inReader = new InputStreamReader(System.in);
			fWriter = new FileWriter(file);

			int inData = 0;

			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData);
			}
			
			// -1 파일의 끝
			fReader = new FileReader(fileName);
			int inData2 = 0;
			while((inData2 = fReader.read()) != -1){
				System.out.println((char)inData);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace(); 
		}
		catch (IOException e) {
			System.out.println("파일 입출력 에러");
			e.printStackTrace();
		} finally {
			try {
				if (fWriter != null)
					fWriter.close();
				if (inReader != null)
					inReader.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}
