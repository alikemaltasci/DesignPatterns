package com.designpatterns.creational.builder;

public class Menu {

	private String drink;
	private String soup;
	private String meal;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getSoup() {
		return soup;
	}

	public void setSoup(String soup) {
		this.soup = soup;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	
	@Override
	public String toString() {
		return "Menu [drink=" + drink + ", soup=" + soup + ", meal=" + meal + "]";
	}
		
}
