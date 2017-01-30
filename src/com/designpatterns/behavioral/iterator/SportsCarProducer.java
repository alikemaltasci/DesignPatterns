package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SportsCarProducer implements CarProducer {
	
	private ArrayList<String> cars;
	
	public SportsCarProducer() {
		cars = new ArrayList<String>();
		
		cars.add("SportCar_1");
		cars.add("SportCar_2");
	
	}

	@Override
	public Iterator getIterator() {
		return cars.iterator();
	}

}
