package org.java.oop;

public class CarEngine {
	public String engineName;
	public int enginePrice;
	public int engineYear;

	@Override
	public String toString() {

		String rs = this.engineName + ", " + this.enginePrice + ", " + this.engineYear;
		return rs;
	}
}
