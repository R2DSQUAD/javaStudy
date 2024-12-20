package org.java.innerClass;

interface In4 {
	void m1();
}

class In4Sub implements In4 {

	@Override
	public void m1() {
		System.out.println("m1() -> 오버라이드 In4");
	}
	
}

public class RamdaEx1 {
	public static void main(String[] args) {
		In4Sub i4 = new In4Sub();
		i4.m1();
		
		In4 in4 = new In4() {

			@Override
			public void m1() {
				System.out.println("m1() -> 오버라이드 In4(익명)");
				
			}
			
		};
		in4.m1();
		System.out.println("===람다식===");
		
		//람다식
		
//		In4 in42 = () -> {
//			System.out.println("m1() -> 오버라이드 In4(람다식)");
//		};
		
		In4 in42 = () -> System.out.println("m1() -> 오버라이드 In4(람다식)");
		//하나일 경우 중괄호 생략 가능
		
		in42.m1();
		
		
		
		
		
	}
}
