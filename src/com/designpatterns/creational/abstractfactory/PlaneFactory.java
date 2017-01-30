package com.designpatterns.creational.abstractfactory;

public class PlaneFactory extends VehicleFactory {

	@Override
	public Vehicle makeVehicle(String typeOfVehicle) {
		if("Combat Plane".equals(typeOfVehicle)){
			return new CombatPlane();
		}else if ("Passenger Plane".equals(typeOfVehicle)){
			return new PassengerPlane();
		}
		
		return null;
	}

	@Override
	public Engine addEngine() {
		return new PlaneEngine();
	}
	
}
