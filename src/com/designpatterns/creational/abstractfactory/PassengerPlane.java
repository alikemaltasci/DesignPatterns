package com.designpatterns.creational.abstractfactory;

public class PassengerPlane implements Vehicle {

	@Override
	public void move() {
		System.out.println("Passenger plane is flying");
	}

}
