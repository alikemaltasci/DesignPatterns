package com.designpatterns.behavioral.chainofresponsibility;

public class RobotBodyAssembler extends RobotPartAssembler {
	
	@Override
	public void assemble() {
		System.out.println("Robot's body is assembled");
		getNextAssembler().assemble();
		
	}


}
