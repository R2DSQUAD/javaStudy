package org.java.oop;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ClassBasic {
	
	// 멤버
	// 1. 인스턴스 멤버 -> new 객체를 생성
	// 2. 클래스 멤버 -> 공용데이터
	
	// 1). 필드
	public int a;
	protected int b;
	int c;
	private int d;
	public int[] arrIn;
	public LocalDateTime createTime;
	 
	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public static final String PROJECTNAME="WEB2025";
	
	// 2). 생성자
	public ClassBasic() {
//		this(10);
		System.out.println("기본 생성자");
	}
	
	//메서드 오버로딩
	public ClassBasic(int d) {
		this.d=d;
	}

	public ClassBasic(int a, int b, int c, int d, int[] arrIn, LocalDateTime createTime) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.arrIn = arrIn;
		this.createTime = createTime;
	}

	public void m1() {
		System.out.println("m1");
	}
	
	public int m1(int a) {
		int f=10+a;
		return f;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int[] getArrIn() {
		return arrIn;
	}

	public void setArrIn(int[] arrIn) {
		this.arrIn = arrIn;
	}
	
	
	
	// 3). 메서드
}
