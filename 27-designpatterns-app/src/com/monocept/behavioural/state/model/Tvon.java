package com.monocept.behavioural.state.model;

public class Tvon implements ITelevision{

	@Override
	public void changeState(TelevisionState tv) {
		System.out.println("tv is on change it to off");
		tv.setItelevision(new Tvoff());
		
	}

}
