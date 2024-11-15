package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx1 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime);
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime);
		System.out.println(localDateTime);
		
		System.out.println(localDateTime);
	}
}
