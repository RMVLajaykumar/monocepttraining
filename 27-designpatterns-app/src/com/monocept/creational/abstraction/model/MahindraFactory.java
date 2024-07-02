package com.monocept.creational.abstraction.model;

public class MahindraFactory implements ICarFactory {
	
	public ICars makeCar() {
		return new Mahindra();
		
	}

}
