package com.designpatterns.behavioral.command;

public class RemoteControl {

	public void press(Command command) {
		command.execute();
	}

}
