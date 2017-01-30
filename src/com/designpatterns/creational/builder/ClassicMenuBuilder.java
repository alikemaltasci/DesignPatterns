package com.designpatterns.creational.builder;

public class ClassicMenuBuilder extends MenuBuilder {

	@Override
	public void addDrink() {
		menu.setDrink("Cola");

	}

	@Override
	public void addSoup() {
		menu.setSoup("Lentil Soup");

	}

	@Override
	public void addMeal() {
		menu.setMeal("Rosto");

	}

}
