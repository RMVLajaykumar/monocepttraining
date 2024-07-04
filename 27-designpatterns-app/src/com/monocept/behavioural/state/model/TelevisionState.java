package com.monocept.behavioural.state.model;

public class TelevisionState {
	
	private ITelevision tv;

	public ITelevision getItelevision() {
		return tv;
	}

	public void setItelevision(ITelevision tv) {
		this.tv = tv;
	}
	
	
	public void pressButton() {
		tv.changeState(this);
	}

	public TelevisionState(ITelevision tv) {
		super();
		this.tv = tv;
	}

	
	
	

}
