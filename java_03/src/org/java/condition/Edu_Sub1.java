package org.java.condition;

import java.util.Scanner;

public class Edu_Sub1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scn.nextInt();
		System.out.print("영어 점수: ");
		int eng = scn.nextInt();
		System.out.print("수학 점수: ");
		int math = scn.nextInt();
		
		Edu edu = new Edu(kor, eng, math);
		
		String grade = edu.gradeMethod();
		System.out.println(edu.toString());
		System.out.println("학점: "+grade);		
		System.out.println("총 점수: "+ edu.sum+"점");
		System.out.println("평균 점수: "+ edu.avg+"점");
		
		scn.close();
	}
}
