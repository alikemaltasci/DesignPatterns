package com.designpatterns.structural.decorator;

public class GardenHouseDecorator extends HouseDecorator{

	public GardenHouseDecorator(House house) {
		super(house);
	}

	@Override
	public void buildHouse() {
		super.buildHouse();
		addGarden();
	}

	private void addGarden() {
		System.out.println("Garden is added");		
	}

}
