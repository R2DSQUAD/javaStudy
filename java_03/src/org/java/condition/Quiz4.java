package org.java.condition;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		System.out.println("if -> Quiz");
//		성적 관리 프로그램
		Scanner scn = new Scanner(System.in);
		
		double avg;
		int sum;
		
		System.out.print("국어 점수: ");
		int kor = scn.nextInt();
		System.out.print("영어 점수: ");
		int eng = scn.nextInt();
		System.out.print("수학 점수: ");
		int math = scn.nextInt();
		
		if(kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && math >= 0 && math <= 100) {
			sum = kor+eng+math;
			avg = ((double)kor+eng+math)/3;
			System.out.println("국어 : "+ kor);
			System.out.println("영어 : "+ eng);
			System.out.println("수학 : "+ math);
			System.out.println("총점 : "+ sum);
			System.out.println("평균 : "+ avg);
			if(avg >= 90) {
				if(avg >= 95) {
					System.out.println("A+");
				}else {
					System.out.println("A");
				}
			}else if(avg >= 80) {
				if(avg >= 85) {
					System.out.println("B+");
				}else {
					System.out.println("B");
				}
			}else if(avg >= 70) {
				if(avg >= 75) {
					System.out.println("C+");
				}else {
					System.out.println("C");
				}
			}else if(avg >= 60) {
				if(avg >= 65) {
					System.out.println("D+");
				}else {
					System.out.println("D");
				}
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("제약 조건(contraint) => 입력 점수는 정수 0부터 100까지 입니다.");
		}
		
		scn.close();
		
	}
}
