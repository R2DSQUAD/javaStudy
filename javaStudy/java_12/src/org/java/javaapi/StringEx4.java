package org.java.javaapi;

public class StringEx4 {
	public static void main(String[] args) {
		System.out.println("===== String =====");
		//1. immutable 불변
		//2. new ,""
		//3. 웹개발 -> form(입력), 데이터 출력, 기본적인 문자열에 사용
		//4. 대용량 문자열 데이터, OPEN API에서 제공되어지는 실시간 문자열 데이터
		String str1 = new String("문자열1");
		String str2 = "문자열1";
		System.out.println(str1==str2);
		// 문자열 -> Wrapper
		String num1 = "100";
		// 박싱
		Integer i1 = Integer.parseInt(num1);
		// String -> int
		int i2= Integer.parseInt(num1);
		// int -> Integer -> String
		String i1Str = i1.toString();
		System.out.println(i1+", "+i2+", "+i1Str);
		
		String search="상품";
		String itemTitle="상품A";
		
		System.out.println(itemTitle.contains(search));
		System.out.println(itemTitle.contains(search));
		//양수  -> 앞, 음수 > 뒤, 같으면 -> 같은 문자열
		System.out.println(itemTitle);
		
		System.out.println();
		
		String str ="abc";
		
		System.out.println("subString -> 특정 문자열 추출");
		String query1="insert.do";
		String query2="memberDelete.do";
		String query3="update.do";
		// insert.do, memberDelete.do, update.do
		//.do를 제외한 문자열 추출
		
		System.out.println(query1.substring(0, query1.length()-3));
		System.out.println(query2.substring(0, query2.length()-3));
		System.out.println(query3.substring(0, query3.length()-3));
		
		StringBuffer sb = new StringBuffer("문자열: ");
		
		System.out.println("===== StringBuffer =====");
		// 1. 문자열을 추구하거나 변경할 떄 주로 사용하는 자료형
		// 2. 생성된 이후에도 문자열의 내용 수정 가능
		System.out.println(sb);
		sb.append("추가 문자열");
		System.out.println(sb);
		sb.delete(0,1);
		System.out.println(sb);
		sb.insert(0, "2025");
		System.out.println(sb);
		
		System.out.println("===== StringBuilder =====");
		
		StringBuilder sf = new StringBuilder("문자열: ");
		System.out.println(sf);
		sb.append("추가 문자열");
		System.out.println(sf);
		sb.delete(0,1);
		System.out.println(sf);
		sb.insert(0, "2025");
		System.out.println(sf);
		
	}
}
