package com.designpatterns.behavioral.command;

public class GoBackwardCommand implements Command {
	
	private Robot robot;
	
	public GoBackwardCommand(Robot robot){
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.goBackward();
		
	}

	@Override
	public void undo() {
		robot.goForward();
		
	}
	
	

}
