package org.java.loop;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean bool = false;

		while (!bool) {
			System.out.println("프로그램을 실행하시겠습니까? (Y/N)");
			String start = scn.next();
			while (!bool) {
				if (start.equals("y") || start.equals("yes")) {
					System.out.println("쿼리문을 입력하세요. (insert, select, update, delete)");
					System.out.print("Query: ");
					String value = scn.next();

					if (value.equals("insert")) {
						System.out.println("회원가입");
					} else if (value.equals("select")) {
						System.out.println("회원조회");
					} else if (value.equals("update")) {
						System.out.println("회원수정");
					} else if (value.equals("delete")) {
						System.out.println("회원탈퇴");
					} else if (value.equals("exit")) {
						System.out.println("프로그램 종료");
						bool = true;
//						break;
					} else {
						System.out.println("다시 입력해주세요\n\n\n\n\n\n\n\n\n");
					}
				} else {
					System.out.println("프로그램 종료");
					bool = true;
//					break;
				}
			}
			
		}scn.close();
	}
}
