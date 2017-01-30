package com.designpatterns.creational.factorymethod;

public class ShapeFactory {

	public Shape makeShape(String shapeName) {
		
		if (shapeName.equals("C")) {
			return new Circle();
		} else if (shapeName.equals("T")) {
			return new Triangle();
		}

		return null;
	}

}
