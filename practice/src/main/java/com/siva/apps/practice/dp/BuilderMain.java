package com.siva.apps.practice.dp;

import com.siva.apps.practice.dp.builder.Car;
import com.siva.apps.practice.dp.builder.CarBuilder;

public class BuilderMain {

	public static void main(String args[]) {
		Car cObj = new Car("KIA", "Seltos" ,"2020", "SUV", 1300000);
		System.out.println(cObj.toString());
		
		Car cBuilder=new CarBuilder().setBrand("Honda").setModel("City").getCar();
		System.out.println(cBuilder.toString());
		
	}
	
}
