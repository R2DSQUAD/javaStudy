package org.java.javaapi;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		//서버 -> http://localhost:8085
 		System.out.println("======== StringTokenizer ========");
		String url = "http://localhost:8085/joinOk,.do?email=m1@email.com&password=1111&name=m1";
		String formData = "email=m1@email.com&password=1111&name=m1";
		
		StringTokenizer token = new StringTokenizer(formData, "&");
		
		System.out.println(token);
		//email=m1@email.com
		//password=1111
		//name=m1
		
		int size = token.countTokens();
		System.out.println(size);
		
		//토큰이 존재하면 while문 실행
		//모든 토큰을 조회
		while(token.hasMoreElements()) {
			//token요소를 하나씩 조회
			String tokenstr = token.nextToken();
			
			System.out.println(tokenstr);
		}
		
		String phone= "010-1234-5678";
		
		StringTokenizer token1 = new StringTokenizer(phone, "-");
		while(token1.hasMoreElements() ) {
			String tokenstr = token1.nextToken();
			System.out.print(tokenstr);
		}
		
	}
}
