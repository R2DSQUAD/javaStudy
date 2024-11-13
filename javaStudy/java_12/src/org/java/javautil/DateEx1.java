package org.java.javautil;

import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        System.out.println("=== DATE ===");

        Date date = new Date();
        System.out.println(date.getTimezoneOffset());
        System.out.println(date);
        System.out.println(date.getYear()+1900+"년");
        System.out.println(date.getMonth()+1+"월");
        System.out.println(date.getDate()+("일"));
        System.out.println(date.getHours()+("시"));
        System.out.println(date.getMinutes()+("분"));
        System.out.println(date.getSeconds()+("초"));
        System.out.println(date.getDay()+("요일"));
        
        
        
        
        switch (date.getDay()) {
        case 0:
        	System.out.println("일요일");
        	break;
        case 1:
        	System.out.println("월요일");
        	break;
        case 2:
        	System.out.println("화요일");
        	break;
        case 3:
        	System.out.println("수요일");
        	break;
        case 4:
        	System.out.println("목요일");
        	break;
        case 5:
        	System.out.println("금요일");
        	break;
        case 6:
        	System.out.println("토요일");
        	break;
        default:
        	System.out.println("에러");
        	throw new IllegalArgumentException();
        }
    }
}

