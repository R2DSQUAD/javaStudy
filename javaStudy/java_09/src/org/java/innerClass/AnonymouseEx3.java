package org.java.innerClass;

interface In1 {
	void m1();
}

interface In2 extends In1 {
	void m2();
}

interface In3 extends In2 {
	void m3();
}

class In3Sub implements In3{

	@Override
	public void m1() {
		System.out.println("m1 -> 오버라이드");
		
	}
	
	@Override
	public void m2() {
		System.out.println("m2 -> 오버라이드");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 -> 오버라이드");
		
	}
	
}

public class AnonymouseEx3 {
	public static void main(String[] args) {
		In1 i1 = new In3Sub();
		i1.m1();
		System.out.println();
		
		In2 i2 = new In3Sub();
		i2.m1();
		i2.m2();
		System.out.println();
		
		In3 i3 = new In3Sub();
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println();
		
		In3Sub in3Sub = new In3Sub();  
		in3Sub.m1();
		in3Sub.m2();
		in3Sub.m3();
		System.out.println();
		
		System.out.println("익명(무명)클래스 -> 오버라이드");
		
		In1 in1 = new In1() {
			@Override
			public void m1() {
				System.out.println("m1 -> 오버라이드(익명)");
			}
		};
		in1.m1();
		
		System.out.println();
		In2 in2 = new In2() {

			@Override
			public void m1() {
				System.out.println("m1 -> 오버라이드(익명) In2");
				
			}

			@Override
			public void m2() {
				System.out.println("m2 -> 오버라이드(익명) In2");
				
				
			}
			
		};
		in2.m1();
		in2.m2();
		
		
		System.out.println();
		In3 in3 = new In3() {

			@Override
			public void m1() {
				System.out.println("m1 -> 오버라이드(익명) In3");
				
			}
			
			@Override
			public void m2() {
				System.out.println("m2 -> 오버라이드(익명) In3");
				
			}

			@Override
			public void m3() {
				System.out.println("m3 -> 오버라이드(익명) In3");
				
			}
			
		};
		in3.m1();
		in3.m2();
		in3.m3();
		
		System.out.println();
		
		In3Sub i3s = new In3Sub() {
			@Override
			public void m1() {
				System.out.println("m1 -> 오버라이드(익명) In3Sub");
				
			}
			
			@Override
			public void m2() {
				System.out.println("m2 -> 오버라이드(익명) In3Sub");
				
			}

			@Override
			public void m3() {
				System.out.println("m3 -> 오버라이드(익명) In3Sub");
				
			}
		};
		i3s.m1();
		i3s.m2();
		i3s.m3();
		
	}
}
