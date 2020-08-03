package com.siva.apps.practice.dp.factory;

public class CarFactory {
	public Car getInstance(String model) {
		switch (model) {
		case "TATA":
			return new Tata();
		case "FORD":
			return new Ford();
		case "HONDA":
			return new Honda();
		case "HYUNDAI":
			return new Hyundai();
		case "KIA":
			return new KIA();
		case "MARUTISUZUKI":
			return new MarutiSuzuki();
		default:
			return new Others();
		}

	}
}
