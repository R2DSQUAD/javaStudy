package org.java.javautil;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		System.out.println("random");
		
		//Math.random() 0보다 크거나 작고 1보다 작음
		Random rd= new Random();
		System.out.println(rd);
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100)); // 0<= Math.random()*101 < 101
		//0<= <45
		System.out.println(rd.nextInt(45));
	}
}
