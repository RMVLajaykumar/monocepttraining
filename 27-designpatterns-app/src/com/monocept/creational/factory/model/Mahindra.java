package com.monocept.creational.factory.model;

public class Mahindra implements Icar {

	@Override
	public void start() {
		System.out.println("Mahindra car starts");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra car stopped");
		
	}

}
