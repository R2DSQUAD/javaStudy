package org.java.oop;

public class CarBasic {
	public String carName;
	public int carPrice;
	public int carYear;

	@Override
	public String toString() {

		String rs = this.carName + ", " + this.carPrice + ", " + this.carYear;
		return rs;
	}
}
