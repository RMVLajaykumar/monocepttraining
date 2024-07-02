package com.monocept.model;

public class RibonHat extends HatDecorator {
  
	
	public RibonHat(IHat ihat) {
		super(ihat);
	}
	
	public String getName() {
		return "ribonhat"+getHat().getName();
	}
	
	public double getPrice() {
		return 250+getHat().getPrice();
	}
	
	public String getDescription() {
		return"its ribons and "+getHat().getDescription();
	}
}
