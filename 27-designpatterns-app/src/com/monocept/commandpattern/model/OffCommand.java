package com.monocept.commandpattern.model;

public class OffCommand implements ICommand{
	
	private Telvision tv;

	public Telvision getTv() {
		return tv;
	}

	public void setTv(Telvision tv) {
		this.tv = tv;
	}

	public OffCommand(Telvision tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}
	

}
