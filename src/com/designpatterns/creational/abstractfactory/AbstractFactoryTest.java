package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryTest {
	
	public static void main(String[] args){
		
		
		VehicleFactory planeFactory = new PlaneFactory();
		Vehicle plane = planeFactory.makeVehicle("Passenger Plane");
		Engine planeEngine = planeFactory.addEngine();
		if(plane != null){
			planeEngine.startEngine();
			plane.move();
		}
		
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.makeVehicle("Family Car");
		Engine carEngine = carFactory.addEngine();
		if(car != null){
			carEngine.startEngine();
			car.move();
		}
		
		
	}

}
