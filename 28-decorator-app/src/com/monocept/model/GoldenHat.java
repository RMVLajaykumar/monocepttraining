package com.monocept.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat ihat) {
		super(ihat);
		
		
	}
	public String getName() {
		return "Golden" + getHat().getName();
	}
	
	public double getPrice() {
		return 200 +getHat().getPrice();
	}
	
	public String getDescripion() {
		return "its a golden and "+getHat().getDescription();
	}

}
