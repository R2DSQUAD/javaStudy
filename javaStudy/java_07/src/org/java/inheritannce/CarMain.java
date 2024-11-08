package org.java.inheritannce;

public class CarMain {
	public static void main(String[] args) {
		ACar aCar = new ACar("ACar", 300, 2500, 2025);
		aCar.carInfo();
		System.out.println(aCar.toString());
		System.out.println();
		
		BCar bCar = new BCar("BCar", 500, 3000, 2025);
		bCar.carInfo();
		System.out.println(bCar.toString());
		System.out.println();
		
		CCar cCar = new CCar("CCar", 1000, 4000, 2025);
		cCar.carInfo();
		System.out.println(cCar.toString());
		System.out.println();
		
		DCar dCar = new DCar("DCar", 1000, 4000, 2025);
		dCar.carInfo();
		System.out.println(dCar.toString());
		System.out.println();
	}
}
