package com.siva.apps.practice.dp;

import com.siva.apps.practice.dp.factory.Car;
import com.siva.apps.practice.dp.factory.CarFactory;

public class FactoryMain {
	public static void main(String arg[]) {
		CarFactory cFactory=new CarFactory();
		System.out.print("Brand :");
		Car carObj=cFactory.getInstance("KIA");
		carObj.showBrand();
		
		System.out.println("Models:");
		for (String model:carObj.listModels()) {
			System.out.println(model);
		}
		
	}
}
