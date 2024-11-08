package org.java.condition;

public class SwitchEx2 {

	// static class member
	public static final String ROLE = "ROLE_ADMIN";

	public static void main(String[] args) {
		System.out.println("switch");

		// 클래스 멤버 -> 클래스명. 클래스 멤버
		System.out.println(SwitchEx2.ROLE);

		switch (SwitchEx2.ROLE) {
		case "ROLE_MEMBER":
			System.out.println("일반회원");
			break;
		case "ROLE_MANAGER":
			System.out.println("일반관리자");
			break;
		case "ROLE_ADMIN":
			System.out.println("프로젝트 관리자");
			break;
		default:
			throw new IllegalArgumentException("입력오류");                                                  
		}
		
		//범위는 switch 에서 불가능
	}
}
