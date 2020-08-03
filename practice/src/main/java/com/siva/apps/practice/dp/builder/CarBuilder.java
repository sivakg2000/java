package com.siva.apps.practice.dp.builder;

public class CarBuilder {

	private String brand;
	private String model;
	private String mYear;
	private String bodyType;
	private double price;
	
	public CarBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public CarBuilder setmYear(String mYear) {
		this.mYear = mYear;
		return this;
	}
	public CarBuilder setBodyType(String bodyType) {
		this.bodyType = bodyType;
		return this;
	}
	public CarBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Car getCar() {
		return new Car(brand, model, mYear, bodyType, price);
	}
	
}
