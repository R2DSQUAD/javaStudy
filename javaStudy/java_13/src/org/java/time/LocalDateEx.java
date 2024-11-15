package org.java.time;


import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
		System.out.println("localDate");
		
		LocalDate localDate = LocalDate.now();			//현 시점 -> 날짜
		
		System.out.println(localDate);
		System.out.println(localDate.getYear()); 		//년
		System.out.println(localDate.getMonthValue());	//월
		System.out.println(localDate.getMonth());		//월 (영어)
		System.out.println(localDate.getDayOfMonth());		//일
		System.out.println(localDate.getDayOfYear());		//연 대비 일
		System.out.println(localDate.getDayOfWeek());		//요일		
		
		System.out.println(localDate.getYear()+"년 "+ localDate.getMonthValue()+"월 "+ localDate.getDayOfMonth()+"일 "+localDate.getDayOfWeek());
		
		// 예약
		LocalDate localDate2 = LocalDate.of(2024, 11, 14);
		System.out.println(localDate2);
		
		System.out.println(localDate2);
		System.out.println(localDate2.getYear()); 		//년
		System.out.println(localDate2.getMonthValue());	//월
		System.out.println(localDate2.getMonth());		//월 (영어)
		System.out.println(localDate2.getDayOfMonth());		//일
		System.out.println(localDate2.getDayOfYear());		//연 대비 일
		System.out.println(localDate2.getDayOfWeek());		//요일	
	}
}
