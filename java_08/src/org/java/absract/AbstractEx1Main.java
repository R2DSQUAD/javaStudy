package org.java.absract;

public class AbstractEx1Main {
	public static void main(String[] args) {
		//추상 클래스는 객체를 생성 X
		AbstractEx1Sub ab1 = new AbstractEx1Sub();
		
		ab1.num1=10;
		ab1.num2=10;
		ab1.num3=10;
		ab1.num4=10;
		ab1.instanceMethod();
		ab1.m1(100, 200);
		//추상메서드 구현
		ab1.abstractMethod();
		
		AbstractEx1Sub2sub ab2 = new AbstractEx1Sub2sub();
		ab2.num1=10;
		ab2.num2=10;
		ab2.abstractMethod();
		ab2.abstractMethod2();
		ab2.instanceMethod();
		
		AbstractEx1 ab3 =new AbstractEx1Sub();
		ab3 = abstractMethod();
			
		ab3 = new AbstractEx1Sub2sub();
			
		ab3 = abstractMethod();
		int i=10;
		int i2= 20;
	
	}

	private static AbstractEx1 abstractMethod() {
		// TODO Auto-generated method stub
		return null;
	}
}
