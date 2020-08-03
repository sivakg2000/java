package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class Tata implements Car {

	public void showBrand() {
		System.out.println("Tata");

	}

	public List<String> listModels() {
		List<String> cList=new ArrayList<>();
		cList.add("Tiago");
		cList.add("Altroz");
		cList.add("Tigor");
		cList.add("Nexon");
		cList.add("Harrier"); 
		
		return cList;
	}

}
