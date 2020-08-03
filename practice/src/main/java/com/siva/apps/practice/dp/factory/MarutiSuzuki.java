package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class MarutiSuzuki implements Car {

	public void showBrand() {
		System.out.println("MarutiSuzuki");

	}

	public List<String> listModels() {
		List<String> cList=new ArrayList<>();
		cList.add("Alto");
		cList.add("Swift");
		cList.add("Swift Dizire");
		cList.add("Baleno");
		cList.add("Vitara Brezza");
		cList.add("Wangon R");
		cList.add("Ciaz");
		
		return cList;

	}

}
