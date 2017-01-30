package com.designpatterns.structural.decorator;

public class DecoratorTester {
	
	public static void main(String[] args){
		
		House houseWithBalconyAndGarden = new GardenHosueDecorator( new BalconyHouseDecorator( new BasicHouse() ));
		
		houseWithBalconyAndGarden.buildHouse();
		
	}

}
