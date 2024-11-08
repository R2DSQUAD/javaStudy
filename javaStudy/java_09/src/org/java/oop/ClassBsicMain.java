package org.java.oop;

import java.time.LocalDateTime;

public class ClassBsicMain {
	public static void main(String[] args) {
		String projectName = ClassBasic.PROJECTNAME;
		System.out.println(projectName);
		
		ClassBasic c1 = new ClassBasic();
		c1.setA(10);
		int a = c1.getA();
		
		int[] arrInt = new int[]  {1,2,3};
		ClassBasic c2 = new ClassBasic(10,20,30,40,arrInt,LocalDateTime.now());
		String c2Info=c2.toString();
		System.out.println(c2Info);
		}
}
