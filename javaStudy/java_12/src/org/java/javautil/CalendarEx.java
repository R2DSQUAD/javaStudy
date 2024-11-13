package org.java.javautil;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		System.out.println("=== Calendar ===");
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일요일 1
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //주 수요일 기준
		System.out.println(cal.get(Calendar.HOUR)); //시간
		System.out.println(cal.get(Calendar.MINUTE)); //분
		System.out.println(cal.get(Calendar.SECOND)); //초		
		System.out.println(cal.get(Calendar.WEDNESDAY)); //이번주에 
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //3주차
		System.out.println(cal.get(Calendar.AM_PM)); // 0-> 오전 1-> 오후
	}
}
