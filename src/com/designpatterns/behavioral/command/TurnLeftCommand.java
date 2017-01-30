package com.designpatterns.behavioral.command;

public class TurnLeftCommand implements Command {
	
	private Robot robot;
	
	public TurnLeftCommand(Robot robot){
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.turnLeft();
		
	}

	@Override
	public void undo() {
		robot.turnRight();
		
	}
	
	

}
