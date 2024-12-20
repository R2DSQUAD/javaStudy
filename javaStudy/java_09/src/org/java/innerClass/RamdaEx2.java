package org.java.innerClass;

interface F1 {
	int m1();
}

interface F2 {
	int m2(int num1);
}

interface F3 {
	int m3(int num1, int num2);
}

public class RamdaEx2 {
	public static void main(String[] args) {
		new F1() {

			@Override
			public int m1() {
				System.out.println("m1");
				return 0;
			}
			
		}.m1();
		
		F2 f2 = new F2() {

			@Override
			public int m2(int num1) {
				System.out.println("m2");
				return num1;
			}
			
		};
		int num2 = f2.m2(200);
		
		System.out.println(num2);
		
		F3 f3 = new F3() {

			@Override
			public int m3(int num1, int num2) {
				System.out.println("m3");
				return num1+num2;
			}
			
		};
		int sum = f3.m3(100,200);
		System.out.println(sum);
		
		
		
		
		
		System.out.println("람다식");
		
		
		
		//람다식
		
		F1 f12 = () -> {
			System.out.println("m1");
			return 0;
		};
		int num12 = f12.m1();
		System.out.println(num12);
		
		F2 f21 = (n1) -> {
			System.out.println("m2");
			return n1;
		};
		
		int n21 = f21.m2(100);
		System.out.println(n21);
		
		F3 f31 = (n1, n2) -> {
			System.out.println("m3");
			return n1+n2;
		};
		
		int sum2 = f31.m3(100, 200);
		System.out.println(sum2);
		
		//return 문이 하나일 경우
		F3 f33 = (n1,n2) -> n1 + n2;
		int sum33 = f33.m3(100, 200);
		System.out.println(sum33);
		
		
	}
}
