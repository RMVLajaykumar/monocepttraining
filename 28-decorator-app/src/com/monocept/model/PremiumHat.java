package com.monocept.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Premium hat";
	}

	@Override
	public double  getPrice() {
		return 100;
		
	}

	@Override
	public String getDescription() {
		return "its a premium hat";
	}

}
