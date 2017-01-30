package com.designpatterns.creational.abstractfactory;

public class CarEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Car Engine started");		
	}

}
