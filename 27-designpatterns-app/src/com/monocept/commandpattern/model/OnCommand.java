package com.monocept.commandpattern.model;

public class OnCommand implements ICommand {
	
	
	private Telvision tv;

	public Telvision getTv() {
		return tv;
	}

	public void setTv(Telvision tv) {
		this.tv = tv;
	}

	public OnCommand(Telvision tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		
	}
	

}
