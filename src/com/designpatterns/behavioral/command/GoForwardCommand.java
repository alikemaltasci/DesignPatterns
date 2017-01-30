package com.designpatterns.behavioral.command;

public class GoForwardCommand implements Command {
	
	private Robot robot;
	
	public GoForwardCommand(Robot robot){
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.goForward();
		
	}

	@Override
	public void undo() {
		robot.goBackward();
		
	}
	
	

}
