package org.java.innerClass;

public class InnerClassBasic1Class {
	public static void main(String[] args) {
		InnerClassBasic1 inner1 = new InnerClassBasic1();
		inner1.a = 10;
		inner1.instanceMethod();
		
		System.out.println("====인스턴스 클래스====");
		
		InnerClassBasic1.InstanceClass instanceClass = new InnerClassBasic1().new InstanceClass();
		int b= instanceClass.b=10;
		System.out.println("내부 클래프 b-> " +b);
		instanceClass.m1();
		
		InnerClassBasic1 inner2 = new InnerClassBasic1();
		InnerClassBasic1.InstanceClass2 instanceClass2 = inner2.new InstanceClass2();
		int c=instanceClass2.c=100;
		System.out.println("내부클래스 c->"+c);
		instanceClass2.m2();
		
		//클래스멤버 -> 클래스명, 멤버
		int max_number=InnerClassBasic1.MEMBER_MAX;
		System.out.println(max_number);
		
		System.out.println("====static클래스====");
		
		//static 클래스
		InnerClassBasic1.StaticClass.f=100;
		InnerClassBasic1.StaticClass.f1();
		
		System.out.println("====지역클래스====");
		
		//지역클래스
		InnerClassBasic1 inner3 = new InnerClassBasic1();
		inner3.localMethod();
		
		
}
}
