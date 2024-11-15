package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx4 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime is~");
		
		//이전, 동일, 이후
		LocalDateTime startTime = LocalDateTime.now();
		System.out.println(startTime);
		
		LocalDateTime endTime = LocalDateTime.of(2024, 12,20,16,0,0);
		System.out.println(endTime);
		
		//이전
		boolean bool=startTime.isBefore(endTime);
		if(!bool) {
			System.out.println("예약 시작 일은 예약 종료일보다 이전 일이어야 합니다!");
		}
		
		//동일	-> 예약한 날 확인
		boolean bool2=startTime.equals(endTime);
		if(!bool2) {
			System.out.println("두 비교 날짜가 일치 하지 않습니다!");
		}
		
		//이후
		boolean bool3=startTime.isAfter(endTime);
		if(bool3) {
			System.out.println("예약 시작 일은 예약 종료일보다 이전 일이어야 합니다!");
		}
	}
}
