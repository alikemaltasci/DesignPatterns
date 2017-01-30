package com.designpatterns.creational.builder;

public class ChildMenuBuilder extends MenuBuilder {

	@Override
	public void addDrink() {
		menu.setDrink("Lemonade");

	}

	@Override
	public void addSoup() {
		menu.setSoup("Corn Soup");

	}

	@Override
	public void addMeal() {
		menu.setMeal("Hamburger");
	}

}
