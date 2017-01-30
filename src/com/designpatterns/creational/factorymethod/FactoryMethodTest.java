package com.designpatterns.creational.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();
		sf.makeShape("C").draw();
		sf.makeShape("T").draw();
	}

}
