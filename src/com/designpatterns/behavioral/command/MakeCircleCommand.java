package com.designpatterns.behavioral.command;

public class MakeCircleCommand implements Command {

	private Robot robot;
	
	
	public MakeCircleCommand(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void execute() {
		robot.goForward();
		robot.turnRight();
		robot.goBackward();
		robot.turnRight();
		
	}

	@Override
	public void undo() {
		robot.turnLeft();
		robot.goForward();
		robot.turnLeft();
		robot.goBackward();
	}

}
