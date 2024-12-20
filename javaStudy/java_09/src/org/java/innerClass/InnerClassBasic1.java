package org.java.innerClass;

public class InnerClassBasic1 {
	public int a;
	public static final int MEMBER_MAX=1000;

	//instance 클래스
	class InstanceClass{
		int b;
		void m1() {
			System.out.println("m1()");
		}
	}
	
	//instance 클래스
	class InstanceClass2{
		int c;
		void m2() {
			System.out.println("m2()");
		}
	}
	
	//static 클래스
	static class StaticClass{
		static int f;
		static void f1() {
			System.out.println("f1()");
		}
	}
	
	//지역(local) 클래스
	public void localMethod() {
		class LocalClass {
			int d;
			void m4() {
				System.out.println("LocalClass -> m4");
			}
		}
		
		LocalClass local = new LocalClass();
		local.d=100;
		local.m4();
	}
	
	public void op() {
		int a=10;
		int b=10;
		System.out.println(a+b);
	}
	
	//instance 멤버
	public void instanceMethod(){
		System.out.println("instanceMethod");
	}
	
	//static 멤버 -> staic메서드
	public static void staticMethod() {
		//static 멤버(필드)만 참조 할 수 있다.
		System.out.println(MEMBER_MAX);
	}
}
