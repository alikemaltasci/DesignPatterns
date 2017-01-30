package com.designpatterns.behavioral.command;

public class CommandTest {

	public static void main(String[] args) {
		
		
		Robot robot = new Robot();
		
		RemoteControl remote = new RemoteControl();
		
		Command goForwardCommand = new GoForwardCommand(robot);
		Command goBackwardCommand = new GoBackwardCommand(robot);
		Command turnRightCommand = new TurnRightCommand(robot);
		Command turnLeftCommand = new TurnLeftCommand(robot);
		Command makeCircleCommand = new MakeCircleCommand(robot);
		
		remote.press(goForwardCommand);
		remote.press(turnRightCommand);
		remote.press(goBackwardCommand);
		remote.press(turnLeftCommand);
		System.out.println("---------------------");
		remote.press(makeCircleCommand);
		
	}

}
