package com.designpatterns.behavioral.chainofresponsibility;

public class RobotArmAndLegAssembler extends RobotPartAssembler {

	@Override
	public void assemble() {
		System.out.println("Robot's arm and legs are assembled");
	}

}
