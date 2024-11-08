package org.java.interfaceEx;

import org.java.dto.MemberDto;

public class InterfaceSub1Main {
	public static void main(String[] args) {
		InterfaceExSub1 i1 = InterfaceExSub1();
		i1.abstractMethod();
		i1.intMethod();
		MemberDto member= i1.memberMethod();
		System.out.println(member);
	}

	private static InterfaceExSub1 InterfaceExSub1() {
		// TODO Auto-generated method stub
		return null;
	}
}
