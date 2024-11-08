package org.java.varEx;

public class VarEx6 {
	public static final int MAXNUMBER = 10000;
	public static void main(String[] args) {
		System.out.println("참조형(객체형 object) -> String");
		
//		final 상수 호출 -> static 추가 시 -> 클래스명, final 상수명
		System.out.println(VarEx6.MAXNUMBER);
//		VarEx6.MAXNUMBER=2000; final 상수는 수정이 불가능함
		
		
		//String
		String str1=new String("문자열1"); //인스턴트 객체화
		String str2=new String("문자열1"); 
		String str3="문자열1"; 
		String str4="문자열1"; 
		
		//객체의 주소값 비교
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println("==========");
		
		//객체의 참조값 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println("==========");
		
		String userId="m1111";
		System.out.println(userId.equals("m1111"));
		System.out.println(userId.contains("m"));
		System.out.println(userId.charAt(0));
	}
}
