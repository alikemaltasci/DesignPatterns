package com.designpatterns.structural.decorator;

public class BalconyHouseDecorator extends HouseDecorator {

	public BalconyHouseDecorator(House house) {
		super(house);
	}

	@Override
	public void buildHouse() {
		super.buildHouse();
		addBalcony();
	}

	private void addBalcony() {
		System.out.println("Balcony is added");
	}

}
