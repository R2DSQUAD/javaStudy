package org.java.time;

import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeEx3 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");

		// 날짜 비교
		LocalDateTime startDateTime = LocalDateTime.now(); // 오늘
		LocalDateTime endDateTime = LocalDateTime.of(2024, 11, 24, 5, 0, 0);

		System.out.println("기준날짜: " + startDateTime);
		System.out.println("비교날짜: " + endDateTime);

		// 검색 -> 특정 날짜 이전, 이후, 같은 날의 데이터를 조회
		// 이전 날짜?
		boolean bool = startDateTime.isBefore(endDateTime); // true
		System.out.println(bool);

		// 같은 날짜?
		bool = startDateTime.isEqual(endDateTime); // true
		System.out.println(bool);

		// 이후 날짜?
		bool = startDateTime.isAfter(endDateTime); // false
		System.out.println(bool);

		if (startDateTime.isAfter(endDateTime)) {
			System.out.println("선택 날짜 이후입니다.");
		} else {
			System.out.println("선택날짜 이후가 아닙니다.");
		}

		// 날짜 비교 2 -> 차이

		LocalDateTime day1 = LocalDateTime.of(2024, 2, 29, 14, 10, 30);
		LocalDateTime day2 = LocalDateTime.of(2025, 2, 28, 14, 10, 30);
		
		System.out.println("시작일 : "+day1.toLocalDate());
		System.out.println("종료일 : "+day2.toLocalDate());

		Period dayBt = Period.between(day1.toLocalDate(), day2.toLocalDate());
		System.out.println(dayBt);
		System.out.println(dayBt.getYears());
		System.out.println(dayBt.getMonths());
		System.out.println(dayBt.getDays());
	}
}
