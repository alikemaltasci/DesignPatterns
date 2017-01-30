package com.designpatterns.creational.abstractfactory;

public abstract class VehicleFactory {
	
	public abstract Vehicle makeVehicle(String typeOfVehicle);
	public abstract Engine addEngine();	
	
}
