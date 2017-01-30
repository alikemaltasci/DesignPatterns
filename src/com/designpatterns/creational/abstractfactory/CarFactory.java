package com.designpatterns.creational.abstractfactory;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle makeVehicle(String typeOfVehicle) {
		if("Sport Car".equals(typeOfVehicle)){
			return new SportCar();
		}else if ("Family Car".equals(typeOfVehicle)){
			return new FamilyCar();
		}
		
		return null;
	}

	@Override
	public Engine addEngine() {
		return new CarEngine();
	} 

}
