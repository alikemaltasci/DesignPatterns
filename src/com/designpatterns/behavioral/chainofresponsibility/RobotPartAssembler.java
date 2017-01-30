package com.designpatterns.behavioral.chainofresponsibility;

public abstract class RobotPartAssembler {

	private RobotPartAssembler nextAssembler;

	public abstract void assemble();

	public RobotPartAssembler getNextAssembler() {
		return nextAssembler;
	}

	public RobotPartAssembler setNextAssembler(RobotPartAssembler nextAssembler) {
		this.nextAssembler = nextAssembler;
		return nextAssembler;
	}

}
