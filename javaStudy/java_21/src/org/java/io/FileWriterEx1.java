package org.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx1 {
	public static void main(String[] args) {

		System.out.println("IO");
		InputStreamReader inReader = null;
		String fileName = "C:\\test4.txt";
		File file = new File(fileName);
		FileWriter fWriter = null;
		try {
			inReader = new InputStreamReader(System.in);
			fWriter = new FileWriter(file);

			int inData = 0;

			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData);
			}
		} catch (IOException e) {
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
