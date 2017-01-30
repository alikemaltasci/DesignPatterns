package com.designpatterns.structural.adapter;

public class LedTV implements Monitor {

	@Override
	public void display(String message) {
	  System.out.println("The message " + message + " is displaying on LeDTV");
		
	}

}
