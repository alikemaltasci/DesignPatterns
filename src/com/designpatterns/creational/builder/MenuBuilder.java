package com.designpatterns.creational.builder;

public abstract class MenuBuilder {

	protected Menu menu = null;
	
	public void buildMenu() {
		menu = new Menu();
	}
	
	public Menu getMenu(){
		return menu;
	}
	
	public abstract void addDrink();

	public abstract void addSoup();

	public abstract void addMeal();
}
