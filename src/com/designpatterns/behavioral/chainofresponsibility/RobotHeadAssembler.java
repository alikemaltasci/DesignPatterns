package com.designpatterns.behavioral.chainofresponsibility;

public class RobotHeadAssembler extends RobotPartAssembler {

	@Override
	public void assemble() {
		System.out.println("Robot's head is assembled");
		getNextAssembler().assemble();

	}

}
