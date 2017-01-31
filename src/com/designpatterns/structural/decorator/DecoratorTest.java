package com.designpatterns.structural.decorator;

public class DecoratorTest {
	
	public static void main(String[] args){
		
		House houseWithBalconyAndGarden = new GardenHouseDecorator( new BalconyHouseDecorator( new BasicHouse() ));
		
		houseWithBalconyAndGarden.buildHouse();
		
	}

}
