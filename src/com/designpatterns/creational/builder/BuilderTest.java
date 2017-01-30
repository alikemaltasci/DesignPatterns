package com.designpatterns.creational.builder;

public class BuilderTest {
	
	public static void main(String[] args){
		MenuBuilder childMenuBuilder = new ChildMenuBuilder();
		Waiter waiter = new Waiter(childMenuBuilder);
		
		waiter.prepareMenu();
		Menu childMenu = waiter.serveMenu();
		
		System.out.println("Child Menu is prepared : " + childMenu);
		
	}
	

}
