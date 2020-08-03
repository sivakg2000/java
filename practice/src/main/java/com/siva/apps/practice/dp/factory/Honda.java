package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class Honda implements Car {

	public void showBrand() {
		System.out.println("Honda");

	}

	public List<String> listModels() {
		List<String> cList=new ArrayList<>();
		cList.add("City");
		cList.add("W-RV");
		cList.add("B-RV");
		cList.add("C-RV");
		cList.add("Amaze"); 
		
		return cList;
	}

}
