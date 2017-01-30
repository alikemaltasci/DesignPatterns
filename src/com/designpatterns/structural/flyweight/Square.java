package com.designpatterns.structural.flyweight;

public class Square {

	private String color;
	
	public Square(String color) {
		this.color = color;
	}
	
	
	public void draw() {
		System.out.println("Drawing Squre> color:" + color );		
	}
	

}
