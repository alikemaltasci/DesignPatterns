package com.designpatterns.creational.builder;

public class Waiter {
	
	MenuBuilder menuBuilder = null;
	
	public Waiter(MenuBuilder menuBuilder){
		this.menuBuilder = menuBuilder;		
	}
	
	public void prepareMenu(){
		menuBuilder.buildMenu();
		menuBuilder.addDrink();
		menuBuilder.addSoup();
		menuBuilder.addMeal();
	}
	
	public Menu serveMenu(){
		return menuBuilder.getMenu();
	}

}
