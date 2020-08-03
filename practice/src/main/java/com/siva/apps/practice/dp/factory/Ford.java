package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class Ford implements Car {

	public void showBrand() {
		System.out.println("Ford");

	}

	public List<String> listModels() {
		List<String> cList=new ArrayList<>();
		cList.add("Figo");
		cList.add("Eco Sports");
		cList.add("Aspire");
		cList.add("Freestyle"); 
		
		return cList;
	}

}
