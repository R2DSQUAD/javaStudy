package org.java.connect;

import java.sql.Date;
import java.time.LocalDateTime;

public class WrapperEx {
		public static void main(String[] args) {
			//박싱, 언박싱
			System.out.println("Wrapper");
			
//			Date date =new Date();
//			date.getDate(); //레거시 지금 쓰지않음
//			LocalDateTime.now();
			
			Integer i=10;
			Long id = (long)10;
//			long l=10;
			//언박싱 -> 자동언박싱, 삭제 -> 기본
			
//			int i2=i.intValue();
			int i2=i;
//			long l2=i.longValue();
			long l2=i; //Integer -> int -> long
			Long l22=l2;
			
			System.out.println(i2);
			System.out.println(l2);
			System.out.println(l22.toString());
			System.out.println(l22.getClass());
		}
}
