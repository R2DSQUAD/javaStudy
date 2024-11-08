package org.java.interfaceEx;

import org.java.dto.MemberDto;

public interface InterfaceEx2 {
	
//	int a;
//	public static final String PROJECT_NAME = "WEB2025";
	String PROJECT_NAME = "WEB2025";
	String PROJECT_NAME2="WEB2026"; //파이널 필드에 값이 공백이면 안됨
	
//	public abstract void abstractMethod();
	void abstractMethod();
	MemberDto memberMethod();
	int intMethod();

	
}
