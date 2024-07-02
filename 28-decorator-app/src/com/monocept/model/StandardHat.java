package com.monocept.model;

public class StandardHat  implements IHat{

	@Override
	public String getName() {
       return "Standard hat";
	}

	@Override
	public double getPrice() {
		return 200;
		
	}

	@Override
	public String getDescription() {
		return"its a standard hat";
		
	}

}
