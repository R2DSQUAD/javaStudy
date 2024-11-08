package org.java.inheritannce;

public class ACar extends CarBasic {
	private String carName;
	private int carWeigth;
	private int carParice;
	private int carYear;
	
	public ACar() {
		super();
	}
	
	public ACar(String carName, int carWeigth, int carParice, int carYear) {
		super();
		this.carName = carName;
		this.carWeigth = carWeigth;
		this.carParice = carParice;
		this.carYear = carYear;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarWeigth() {
		return carWeigth;
	}

	public void setCarWeigth(int carWeigth) {
		this.carWeigth = carWeigth;
	}

	public int getCarParice() {
		return carParice;
	}

	public void setCarParice(int carParice) {
		this.carParice = carParice;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	@Override
	public void carInfo() {
		System.out.println("A자동차 입니다.");
	}

	@Override
	public String toString() {
		return "ACar [carName=" + carName + ", carWeigth=" + carWeigth + ", carParice=" + carParice + ", carYear="
				+ carYear + "]";
	}
}


