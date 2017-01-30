package com.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {
	
	public static void main(String[] args){
		
		RobotPartAssembler body = new RobotBodyAssembler();
		RobotPartAssembler head = new RobotHeadAssembler();
		RobotPartAssembler armAndLeg = new RobotArmAndLegAssembler();
		
		body.setNextAssembler(head).setNextAssembler(armAndLeg);
		
		body.assemble();
		
	}

}
