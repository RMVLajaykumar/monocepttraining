package com.monocept.model;

public class Boxweight extends Box {
	private double weight;
	
	public Boxweight(double width, double height, double deepth,double weight) {
		super(width,height,deepth);
		this.weight=weight;
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

}
