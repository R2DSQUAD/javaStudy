package org.java.absract;

public class AbstractEx2Main {
	public static void main(String[] args) {
	
		//	new AbstractEx2()
		
		//부모 + 자식 접근
		AbstractEx2Sub1 ab2s1= new AbstractEx2Sub1();
		
		//다형성 -> 부모타입만 접근
		AbstractEx2 ab2 = new AbstractEx2Sub1();
	}
}
