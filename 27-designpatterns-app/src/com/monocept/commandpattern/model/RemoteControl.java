package com.monocept.commandpattern.model;

public class RemoteControl {
	
	ICommand command;
	

	public void pressButton() {
		 command.execute();
	}


	public RemoteControl() {
		super();
	}


	public RemoteControl(ICommand command) {
		super();
		this.command = command;
	}


	public ICommand getCommand() {
		return command;
	}


	public void setCommand(ICommand command) {
		this.command = command;
	}
	

}
