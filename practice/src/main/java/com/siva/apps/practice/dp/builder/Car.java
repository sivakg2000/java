package com.siva.apps.practice.dp.builder;

public class Car {
	
	private String brand;
	private String model;
	private String mYear;
	private String bodyType;
	private double price;
	
	public Car(String brand, String model, String mYear, String bodyType, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.mYear = mYear;
		this.bodyType = bodyType;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", mYear=" + mYear + ", bodyType=" + bodyType + ", price="
				+ price + "]";
	}
	
	
	
	

}
