package com.designpatterns.structural.decorator;

public class GardenHosueDecorator extends HouseDecorator{

	public GardenHosueDecorator(House house) {
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
