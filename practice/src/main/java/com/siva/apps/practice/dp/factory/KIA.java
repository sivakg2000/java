package com.siva.apps.practice.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class KIA implements Car {

	public void showBrand() {
		System.out.println("KIA");

	}

	public List<String> listModels() {
		// TODO Auto-generated method stub
		List<String> cList=new ArrayList<>();
		cList.add("Seltos");
		cList.add("Carnivel");
		cList.add("Sonet");
		
		return cList;
	}

}
