package org.java.oop;

public class CarDoor {
	public String carDoorName;
	public int carDoorPrice;
	public int carDoorYear;

	@Override
	public String toString() {

		String rs = this.carDoorName + ", " + this.carDoorPrice + ", " + this.carDoorYear;
		return rs;
	}
}
