package com.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class IteratorTest {
	
	public static void main(String[] args){
		
		CarProducer classic = new ClassicCarProducer();
		CarProducer sport = new SportsCarProducer();
		
		Iterator classicIterator = classic.getIterator();
		Iterator sportIterator = sport.getIterator();
		
		printCars(classicIterator);
		printCars(sportIterator);
		
		
	}

	private static void printCars(Iterator iterator) {
		while(iterator.hasNext()){
			String car = (String) iterator.next();
			
			System.out.println(car);
		}
		
	}

}
