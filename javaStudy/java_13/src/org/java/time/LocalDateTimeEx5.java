package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx5 {
	public static void main(String[] args) {
		System.out.println("LocalDaeTime");
		
		//plus~ + , min~
		//LocalDate, LocalTime, LocalDateTime,
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜, 시간: " + now);			//날짜, 시간 -> Spring JPA Entity 기본 시간 타입
		System.out.println("현재 날짜: " + now.toLocalDate()); //날짜 
		System.out.println("현재 시간: " + now.toLocalTime());	//시간
		
		LocalDateTime now2 = now.plusYears(10); //년도+
		System.out.println(now2);
		
		LocalDateTime now3 = now.plusMonths(10); //월+
		System.out.println(now3);
		
		LocalDateTime now4=now.plusDays(1); //일 +
		System.out.println(now4);
		
		LocalDateTime now5=now.plusHours(1); //시 +
		System.out.println(now4);
		
		LocalDateTime now6=now.plusMinutes(1); //분 +
		System.out.println(now4);
		
		LocalDateTime now7=now.plusSeconds(1); //초 +
		System.out.println(now4);
		
		

		
		
		
		
		
		
		
	}
}
