package com.monocept.model;
public class OilChange extends CarserviceDecorator{
	
	public OilChange(CarInspection ci ) {
		super(ci);
	}
	
	
	public double getCost() {
		return getCar().getCost()+400;	
		}
	
	
	

}
