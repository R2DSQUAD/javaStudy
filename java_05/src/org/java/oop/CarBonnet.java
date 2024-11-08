package org.java.oop;

public class CarBonnet {
	public String carBonnetName;
	public int carBonnetPrice;
	public int carBonnetYear;

	@Override
	public String toString() {

		String rs = this.carBonnetName + ", " + this.carBonnetPrice + ", " + this.carBonnetYear;
		return rs;
	}
}