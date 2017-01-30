package com.designpatterns.structural.facade;

public class Car {

	Engine engine;
	Tire tire;

	public Car() {
		this.engine = new Engine();
		this.tire = new Tire();
	}

	public void move() {
		engine.start();
		tire.turn();
	}

}
