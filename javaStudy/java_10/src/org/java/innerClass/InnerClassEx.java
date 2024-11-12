package org.java.innerClass;

public class InnerClassEx {

	public int c;
	public static int d;

	// 필드

	// Instance Class
	class InstanceClass {
		int a;

		void m1() {
			System.out.println("m1");
		}
	}

	// Static Class
	public static class StacticClass {
		static final String NAME = "WEB2025";

		static void m2() {
			int f = d;
			System.out.println("m2");
		}
	}

	public void localMethod() {
		class LocalClass {
			void m3() {
				System.out.println("m3");
			}
		}
		new LocalClass().m3();
	}

	public static void main(String[] args) {
		System.out.println(d);

		InnerClassEx inner1 = new InnerClassEx();
		inner1.c = 10;
		inner1.d = 200;
		// 내부 클래스
		// 인스턴스 클래스

		InnerClassEx.InstanceClass inner2 = new InnerClassEx().new InstanceClass();

		inner2.a = 200;
		inner2.m1();

		// static 클래스 -> 부모클래스.static 클래스
		InnerClassEx.StacticClass.m2();
//		InnerClassEx.StacticClass.NAME="WEB2025";
		// 지역클래스
		InnerClassEx inner3 = new InnerClassEx();
		inner3.localMethod();
	};
}
