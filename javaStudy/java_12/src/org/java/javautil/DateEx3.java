package org.java.javautil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx3 {
	public static void main(String[] args) {
		System.out.println("DATE");
		
		//현재 시간 -> 생성, 가입, 작성, 상품등록 시간 -> 자동으로 생성 -> 자동으로 DB테이블에 저장
		Date date1 = new Date();
		Date date2 = new Date(124,10,13);
		System.out.println(date2);
		 
		Date date3 = new Date(124,10,13,15,35,40); //저장되어 있는 시간으로 조회
		System.out.println(date3);
		
		//현재 시간 -> 수정, 회원 수정, 글 수정, 상품 수정 시간 -> 자동으로 생성
		
		Date date4 = new Date();
		SimpleDateFormat sf1 = new SimpleDateFormat("yy년 M월 d일 h시 m분 s초");
		String today = sf1.format(date4);
		System.out.println(today);
	}
}
