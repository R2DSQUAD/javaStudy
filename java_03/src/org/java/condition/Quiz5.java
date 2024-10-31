package org.java.condition;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		System.out.println("class -> if -> Quiz");
		
		System.out.println("if -> Quiz");
//		성적 관리 프로그램
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
		System.out.println("당신의 총점: " + edu.sum);
		System.out.println("당신의 평균: " + edu.avg);
		System.out.println("당신의 학점: " + grade);
		
		scn.close();
	}
}
