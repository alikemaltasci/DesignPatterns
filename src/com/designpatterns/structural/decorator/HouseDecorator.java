package com.designpatterns.structural.decorator;

public abstract class HouseDecorator implements House {

	protected House decoratedHouse;

	public HouseDecorator(House house) {
		this.decoratedHouse = house;
	}

	@Override
	public void buildHouse() {
		decoratedHouse.buildHouse();
	}

}
