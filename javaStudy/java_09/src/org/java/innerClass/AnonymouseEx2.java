package org.java.innerClass;

abstract class Ab1{
	abstract void a();
}

//class Ab1Sub extends Ab1 {
//	
//	@Override
//	void a() {
//		System.out.println("a -> 오버라이드");
//	}
//}

public class AnonymouseEx2 {
	public static void main(String[] args) {
		Ab1 ab1 = new Ab1() {
			@Override
			void a() {
				System.out.println("a -> 오버라이드");
			}
		};
		ab1.a();
	}
}