package com.monocept.behavioural.state.model;

public class Tvoff implements ITelevision {

	@Override
	public void changeState(TelevisionState tv) {
		System.out.println("tv is off change it on");
		tv.setItelevision(new Tvon());
		
	}

}
