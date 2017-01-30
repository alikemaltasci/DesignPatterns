package com.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ClassicCarProducer implements CarProducer {

	String[] cars;

	public ClassicCarProducer() {
		cars = new String[2];

		cars[0] = "ClassicCar_1";
		cars[1] = "ClassicCar_2";
	}

	@Override
	public Iterator getIterator() {
		return Arrays.asList(cars).iterator();
	}

}
