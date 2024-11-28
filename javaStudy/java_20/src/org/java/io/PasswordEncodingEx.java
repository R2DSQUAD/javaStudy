package org.java.io;

import java.util.UUID;

public class PasswordEncodingEx {
	public static void main(String[] args) {
		System.out.println("비밀번호 암호화, 이미지 이름 암호화(원본과 별도로");
		String oldFileName = "shop_01.jpg";
		UUID uuid = UUID.randomUUID();
		
		System.out.println(uuid);
		
		String newFileName=uuid+"_"+oldFileName;
		
		System.out.println(newFileName);
		
		// DB 파일 테이블
		// newFileName, oldFileName -> 필드 값으로 저장
		// 실제 저장되는 이미지는 DB가 아닌 서버(로컬)의 특정 경로
		// -> 반드시 접근 권한을 허용해야함.
		// -> Spring에서는 별도의 Config파일을 이용해서 설정
		// -> 리룩스(AWS) -> chmod -R ~ 이용해서 설정 (관리자 권한으로 )
	}
}
