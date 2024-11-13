package org.java.javautil;

import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		System.out.println("DATE");	
		Date dateTime = new Date();
		String year = dateTime.getYear()+1900+"년 ";
		String month = dateTime.getMonth()+1+"월 ";
		String date = dateTime.getDate()+("일 ");
		String hour = dateTime.getHours()+("시 ");
		String min = dateTime.getMinutes()+("분 ");
		String second = dateTime.getSeconds()+("초 ");
		
		switch (dateTime.getDay()) {
        case 0:
        	System.out.println(year+month+date+hour+min+second+"일요일");
        	break;
        case 1:
        	System.out.println(year+month+date+hour+min+second+"월요일");
        	break;
        case 2:
        	System.out.println(year+month+date+hour+min+second+"화요일");
        	break;
        case 3:
        	System.out.println(year+month+date+hour+min+second+"수요일");
        	break;
        case 4:
        	System.out.println(year+month+date+hour+min+second+"목요일");
        	break;
        case 5:
        	System.out.println(year+month+date+hour+min+second+"금요일");
        	break;
        case 6:
        	System.out.println(year+month+date+hour+min+second+"토요일");
        	break;
        default:
        	System.out.println("에러");
        	throw new IllegalArgumentException();
        }
	}
}
