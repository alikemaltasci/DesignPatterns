package com.designpatterns.behavioral.command;

public class TurnRightCommand implements Command {
	
	private Robot robot;
	
	public TurnRightCommand(Robot robot){
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.turnRight();
		
	}

	@Override
	public void undo() {
		robot.turnLeft();
		
	}
	
	

}
