package org.java.javaapi;

import java.sql.Connection;

import org.java.connect.DBConnect;

class A extends Object {
	int a;
	public A() {
		super();
	}
}

interface In1 {
	void ab1();
}

interface In2 extends In1 {
	void ab2();
}

public class JavaBasicClass {
	public static void main(String[] args) {
		System.out.println("Java 기본 패키지 -> java.lang.*");
		
		A a1 = new A();
		System.out.println(a1.getClass());
		
		In1 in1=()->{
			System.out.println("ab1 구현");
		};
		
		In2 in2= new In2() {

			@Override
			public void ab1() {
				System.out.println("ab1 구현");
				
			}

			@Override
			public void ab2() {
				System.out.println("ab2 구현");
				
			}
			
		};
		
		System.out.println(in2.getClass().getName());
		 System.out.println("Class");
		 
		Connection conn=  DBConnect.getConnection();
		
	}
}
