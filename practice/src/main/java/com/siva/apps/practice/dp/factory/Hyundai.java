package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class Hyundai implements Car {

	public void showBrand() {
		System.out.println("Ford");

	}

	public List<String> listModels() {
		List<String> cList=new ArrayList<>();
		cList.add("Santro");
		cList.add("Grand i10");
		cList.add("Elite i20");
		cList.add("Venue");
		cList.add("Verna");
		cList.add("Creta");
		cList.add("Elantra");
		
		return cList;
	}

}
