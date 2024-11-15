package org.java.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDaetimeEx6 {
public static void main(String[] args) {
	LocalDateTime startDateTime = LocalDateTime.now();
	LocalDateTime endDateTime = LocalDateTime.of(2024, 18,20,16,0,0);
	
	System.out.println("기준날짜"+ startDateTime);
	System.out.println("비교날짜"+ endDateTime);
	
	System.out.println("Duration");
	Duration duration = Duration.between(startDateTime, endDateTime);
	System.out.println("초"+duration.getSeconds());
	System.out.println("나노초"+duration.getNano());
	
	System.out.println("Period");
	LocalDate startDate = LocalDate.of(2024, 2, 14);
	LocalDate endDate = LocalDate.of(2025, 10, 18);
//	Period period = Period.between(startDateTime, endDateTime); 
	
	LocalDateTime sTime = LocalDateTime.now();
	LocalDateTime eTime = LocalDateTime.now();
	
	
}
	
}
