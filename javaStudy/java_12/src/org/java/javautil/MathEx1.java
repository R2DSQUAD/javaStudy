package org.java.javautil;

public class MathEx1 {
	public static void main(String[] args) {
		System.out.println("Math");
		
		
		System.out.println(Math.random());
		// 0 >= Math.random*() < 1
		
		//최대값
		System.out.println(Math.min(10, 20));
		//최소값
		System.out.println(Math.max(10, 20));
		//절대값 (무조건 양수)
 		System.out.println(Math.abs(20));
 		//올림
		System.out.println(Math.ceil(10.2));
		//내림
		System.out.println(Math.floor(10.999));
		//반올림
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.2));
		//원주율 static final 3.141592653589793
		System.out.println(Math.PI);
		
		
	}
}
