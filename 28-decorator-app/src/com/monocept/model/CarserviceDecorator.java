package com.monocept.model;
public  abstract class CarserviceDecorator implements ICarservice {

	
	 private ICarservice car;
	
	
	public ICarservice getCar() {
		return car;
	}


	public void setCar(ICarservice car) {
		this.car = car;
	}


	public CarserviceDecorator(ICarservice car) {
		super();
		this.car = car;
	}


	public double getCost() {
	return car.getCost();
	}
}
