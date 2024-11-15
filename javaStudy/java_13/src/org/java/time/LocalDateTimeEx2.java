package org.java.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx2 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		ZonedDateTime utcZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZonedDateTime);
		
		ZonedDateTime seoulZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulZonedDateTime);
		
		System.out.println("두 날짜 비교1");
		LocalDate today = LocalDate.now(); //현재날짜
		LocalDate oldDate = LocalDate.of(2026, 12, 30);
		
		Period period = oldDate.until(today);
		
		System.out.println(today);
		System.out.println(oldDate);
		System.out.println(period);
		System.out.println(period.getYears());	//년
		System.out.println(period.getMonths());	//월
		System.out.println(period.getDays());	//일
		
		if(period.getDays()>0) {
			System.out.println("시작일이 마지막날보다 크거나 같아야 됩니다.");
		}
		
		
		// 날짜 사이 비교 -> 트겆ㅇ 날짜의 차이 -> ChronoUnit -> new X
		long days= ChronoUnit.DAYS.between(oldDate, today);
		System.out.println(days);	//전체 일수 비교
		System.out.println(ChronoUnit.MONTHS.between(oldDate, today));
		System.out.println(ChronoUnit.YEARS.between(oldDate, today));
	}
}
