package org.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx2 {
	public static void main(String[] args) {
		System.out.println("IO");
		// 문자ㅣ 입력 -> Reader(읽기), Write(쓰기)
		InputStreamReader inputStreamReader = null;
		
		try {
			InputStreamReader inStreamReader= new InputStreamReader(System.in);

			BufferedReader bReader = new BufferedReader(inStreamReader);
			System.out.println("이름 입력: ");
			String name = bReader.readLine();
			
			System.out.println("국어 점수 입력: ");
			String kor = bReader.readLine();
			
			System.out.println("영어 점수 입력: ");
			String eng = bReader.readLine();
			
			System.out.println("수학 점수 입력: ");
			String math = bReader.readLine();
			
			int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
			double avg=(double)sum/3;
			
			System.out.println("합계" + sum);
			System.err.println("평균" + avg);
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		

	}
}
