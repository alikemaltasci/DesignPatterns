package com.designpatterns.behavioral.command;

public class Robot {
	
	public void turnRight(){
		System.out.println("Turned right");
	}
	
	public void turnLeft(){
		System.out.println("Turned left");
	}
	
	public void goForward(){
		System.out.println("Gone forward");
	}
	
	public void goBackward(){
		System.out.println("Gone backward");
	}

}
