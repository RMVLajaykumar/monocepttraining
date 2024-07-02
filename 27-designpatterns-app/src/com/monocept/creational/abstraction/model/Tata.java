package com.monocept.creational.abstraction.model;

public class Tata implements ICars {

	@Override
	public void start() {
		System.out.println("tata car started");
		
	}

	@Override
	public void stop() {
		System.out.println("tata car stopped");
		
	}

}
