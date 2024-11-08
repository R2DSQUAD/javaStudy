package org.java.varEx;

public class VarEx7 {
	public static void main(String[] args) {
		System.out.println("형변환");
		
		// 자동형변환
		
		int i=10;
		byte b=10;
	
		i=b; //작은 -> 큰형 자동 형변환
		
//		byte b2=b+10; byte+int => int+int
		int b2=b+10;
//		byte b3=b+(byte)10; // int 아래 단위 연산 시, int로 변환 됨
		byte b4=(byte)(b+10); //(byte)(int+int)
		
//		b=i; 에러
		b=(byte)i; //강제 형변환, 손실 있음
		b=10;
		
		
		double d = 0.5+10;
		
		System.out.println(55/2);
		System.out.println((double)(55/2));
		System.out.println(55/(double)2);
		
		float f1 = (float)(12.545445445*10); //double + int => double+double
		double f2=12.545445445*10; //double + int => double+double
		double f12 = ((float)12.545445445*10);
		
		System.out.println("f1-> "+f1);
		System.out.println("f2-> "+f2);
		System.out.println("f12-> "+f12);
		
		long id = 1004;
		System.out.println(id==1004);
	  
		
		
	}
}


