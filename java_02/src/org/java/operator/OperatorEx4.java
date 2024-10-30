package org.java.operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		System.out.println("논리 연산자 && || ^ !");
		
		String dbId="m1111";
		String dbPw="1234";
		
		System.out.println(dbId.equals("m1111") && dbPw.equals("1234")); //T T T
		System.out.println(dbId.equals("m1111") && dbPw.equals("1111")); //T F F
		System.out.println(dbId.equals("m2222") && dbPw.equals("1234")); //F T F
		System.out.println(dbId.equals("m2222") && dbPw.equals("1111")); //F F F
		System.out.println();
		System.out.println(dbId.equals("m1111") || dbPw.equals("1234")); //T T T
		System.out.println(dbId.equals("m1111") || dbPw.equals("1111")); //T F T
		System.out.println(dbId.equals("m2222") || dbPw.equals("1234")); //F T T
		System.out.println(dbId.equals("m2222") || dbPw.equals("1111")); //F F F
		System.out.println();
		System.out.println(!dbId.equals("m1111")); //!T  F
		System.out.println(!dbId.equals("m222")); //!F  T
		System.out.println();
		System.out.println(dbId.equals("m1111") ^ dbPw.equals("1234")); //T T F
		System.out.println(dbId.equals("m1111") ^ dbPw.equals("1111")); //T F T
		System.out.println(dbId.equals("m2222") ^ dbPw.equals("1234")); //F T T
		System.out.println(dbId.equals("m2222") ^ dbPw.equals("1111")); //F F F
	}
}
