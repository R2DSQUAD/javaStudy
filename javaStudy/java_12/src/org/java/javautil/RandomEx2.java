package org.java.javautil;

import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		System.out.println("=== Random ===");

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		int temp = 0;

		Random rd = new Random();

		for (int i = 0; i < 10000; i++) {
			int idx = rd.nextInt(45);

			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
