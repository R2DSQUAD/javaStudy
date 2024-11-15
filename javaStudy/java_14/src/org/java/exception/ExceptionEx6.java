package org.java.exception;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		//예외를 고의도 던지다 -> 개발자
		
		//1. 예외, 메세지
		try {
			Exception e1 = new Exception ("예외 발생");
			System.out.println(e1);
		}catch(Exception e)
		{
			System.out.println("예외 메세지로"+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("기본 실행");
		}
		System.out.println("정상 실행");
	}
}
