package org.java.javaapi;

class A2 {
	int a;

	void m1(int a) {
		this.a = a;
	}
}

class A3 {
	String a;

	void m2(String a) {
		this.a = a;
	}
}

//GenericType Class
class G1<T>{
	T a;
	void m3(T a) {
		this.a=a;
	}
}

public class GenericEx {
	public static void main(String[] args) {
		
		G1<String> g1 = new G1<String>();
		g1.a="String";
		g1.equals("String");
		
		G1<Integer> g2 = new G1<Integer>();
		g2.a=100;
		g2.m3(300);
		
		A2 a2 = new A2();
		a2.a=10;
		a2.m1(100);
		
		A3 a3 = new A3();
		a3.a="문자열";
		a3.m2("문자열");
	}
}
