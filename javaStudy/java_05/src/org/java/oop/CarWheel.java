package org.java.oop;

public class CarWheel {
	public String carWheelName;
	public int carWheelPrice;
	public int carWheelYear;

	@Override
	public String toString() {

		String rs = this.carWheelName + ", " + this.carWheelPrice + ", " + this.carWheelYear;
		return rs;
	}
}
