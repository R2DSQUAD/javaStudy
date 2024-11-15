//package org.java.time;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Scanner;
//
//import org.java.dto.FullCalendarDto;
//
//public class LocalDateTimeList {
//	public static void main(String[] args) {
//		System.out.println("");
////		예약 -> 시작일, 종료일
//		String reserveTitle="";
//		String start="";
//		Scanner sc = new Scanner(System.in);
//		boolean bool = false;
//		
//		while(!bool) {
//			System.out.println("예약을 하시겠습니까? (y/n): ");
//			String q = sc.next();
//			
//			if(q.equals("y")) {
//				while(!bool) {
//					
//					LocalDateTime startDay=null;
//					LocalDateTime endDay=null;
//					
//					System.out.print("예약 시작 년도를 입력하세요 :");
//					int sYear = sc.nextInt();
//					System.out.print("예약 시작 월를 입력하세요 :");
//					int sMonth = sc.nextInt();
//					System.out.print("예약 시작 일을 입력하세요 :");
//					int sDay = sc.nextInt();
//					startDay = LocalDateTime.of(sYear, sMonth, sDay);
//					
//					System.out.print("예약 종료 년도를 입력하세요 :");
//					int eYear = sc.nextInt();
//					System.out.print("예약 종료 월를 입력하세요 :");
//					int eMonth = sc.nextInt();
//					System.out.print("예약 종료 일 입력하세요 :");
//					int eDay = sc.nextInt();
//					endDay = LocalDateTime.of(eYear, eMonth, eDay);
//					
//					System.out.println("예약 시작일: "+startDay);
//					System.out.println("예약 종료일: "+endDay);
//					
//					FullCalendarDto fullCalenderDto = new FullCalendarDto(startDay, endDay);
//					
//					
//					System.out.print("종료 하시겠습니까? (y/n): ");
//					String quit = sc.next();
//					if (quit.equals("y")) {
//						bool=true;
//					}
//				}
//				
//			}else {
//				System.out.println("종료");
//				bool=true;
//			}
//			
//			
//			sc.close();
//		
//		}
//	}
//}