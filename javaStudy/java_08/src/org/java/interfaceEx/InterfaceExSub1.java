package org.java.interfaceEx;

import org.java.dto.MemberDto;

public class InterfaceExSub1 implements InterfaceEx1, InterfaceEx2{

	@Override
	public MemberDto memberMethod() {
		System.out.println("memberMethod");
		return new MemberDto(0, "m1", "mm2", "MMM3", "MMMM4", null, null, null);
	}

	@Override
	public int intMethod() {
		System.out.println("intMethod");
		return 0;
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstractMethod");
		
	}

	
}
