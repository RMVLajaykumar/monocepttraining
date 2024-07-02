package com.monocept.creational.abstraction.model;

public class Maruti implements ICars{

	@Override
	public void start() {
		System.out.println("maruti car started");
		
	}

	@Override
	public void stop() {
		System.out.println("maruti car stopped");
		
	}
	

}
