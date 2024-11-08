package org.java.oop;

public class CarMain {
	public static void main(String[] args) {

		// 기본
		CarBasic carA = new CarBasic();
		carA.carName = "A자동차";
		carA.carPrice = 3000;
		carA.carYear = 2025;
		System.out.println(carA.toString());

		// 엔진
		CarEngine engine = new CarEngine();
		engine.engineName = "ACar_Engine";
		engine.enginePrice = 500;
		engine.engineYear = 2025;
		System.out.println(engine.toString());

		// 본넷
		CarBonnet bonnet = new CarBonnet();
		bonnet.carBonnetName = "ACar_bonnet";
		bonnet.carBonnetPrice = 200;
		bonnet.carBonnetYear = 2025;
		System.out.println(bonnet.toString());

		// 휠
		CarWheel wheel = new CarWheel();
		wheel.carWheelName = "ACar_wheel";
		wheel.carWheelPrice = 300;
		wheel.carWheelYear = 2025;
		System.out.println(wheel.toString());

		// 도어
		CarDoor door = new CarDoor();
		door.carDoorName = "ACar_door";
		door.carDoorPrice = 1000;
		door.carDoorYear = 2025;
		System.out.println(door.toString());
	}
}
