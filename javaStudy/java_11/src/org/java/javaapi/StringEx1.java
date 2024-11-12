package org.java.javaapi;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("String");
		
		//String 생성 방법
		// 1. new
		String str1 = new String("문자열1");
		String str2 = new String("문자열1");
		String str3 = new String("문자열1");
		
		// 2. 리터럴 ""
		String str4 = "문자열1";
		String str5 = "문자열1";
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		System.out.println(str1==str4);
		System.out.println();
		System.out.println(str4==str5);
		
		//3. char[]
		char[] arrCh= {'j','a','v','a','2','0','2','5'};
		String strArrCh = new String(arrCh);
		System.out.println(strArrCh);
		
		//4. Wrapper
		System.out.println(Integer.toString(1000));
		
		String intStr = Integer.toString(1000);
		System.out.println(intStr);
		
		
		//5. ObjectMapper	-> JSON	-> Object
	}
}
