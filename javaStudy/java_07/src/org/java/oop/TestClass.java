package org.java.oop;

class S1 extends Object {
	// 필드
	int a;
	int b;

	// 생성자
	// 기본생성자 -> 자동생성
	public S1() {
//		super(); // 부모클래스의 기본 생성자
		this(10,30);
	}
	
	public S1(int a, int b) {
//		this();
		super();
		this.a = a;
		this.b = b;
	}

	// 메서드


	// 오버로드
	public void m1() {
		System.out.println("m1->super");
	}

	public void m1(int a) {
		System.out.println("m1->super2");
	}

	@Override
	public String toString() {
		return "S1 -> a: " + a + ", b: " + b;
	}

}

class S2 extends S1 {
	int c;
	int d;

	// 기본생성자 -> 자동생성
	public S2() {
//		super(); // 부모클래스의 기본 생성자
		super(10, 20);
	}

	@Override
	public String toString() {
		return "S2 -> c: " + c + ", d: " + d;
	}
}

class S3 extends S1 {
	int e;
	int f;

	// 기본생성자 -> 자동생성
	public S3() {
//		super(); // 부모클래스의 기본 생성자
		super(20, 30);
	}

	@Override
	public String toString() {
		return "S3 -> e: " + e + ", f: " + f;
	}
}

public class TestClass {
	public static void main(String[] args) {
		System.out.println("test -> 오버로드, 오버라이드");

		S1 s1 = new S1();
		s1.a = 10;
		s1.b = 20;
		String s1Info = s1.toString();
		System.out.println(s1Info);

		S2 s2 = new S2();
		s2.a = 20;
		s2.b = 30;
		s2.c = 40;
		s2.d = 50;
		String s2Info = s2.toString();
		System.out.println(s2Info);

		S3 s3 = new S3();
		s1.a = 10;
		s1.b = 20;
		s3.e = 30;
		s3.f = 40;
		String s3Info = s3.toString();
		System.out.println(s3Info);
	}
}
