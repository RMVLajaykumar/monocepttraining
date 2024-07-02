package com.monocept.model;

public class WheelAlign extends CarserviceDecorator {

	public WheelAlign(ICarservice ci) {
		super(ci);
	}

	public double getCost() {
		return getCar().getCost() + 550;
	}

}
