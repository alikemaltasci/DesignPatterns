package com.designpatterns.creational.abstractfactory;

public class CombatPlane implements Vehicle {

	@Override
	public void move() {
		System.out.println("Combat Plane i flying");
	}

}
