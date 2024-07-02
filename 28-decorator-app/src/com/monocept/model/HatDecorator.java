package com.monocept.model;

public abstract class HatDecorator implements IHat {
	private IHat ihat;

	public HatDecorator(IHat ihat) {
		super();
		this.ihat = ihat;
	}
	
	public IHat getHat () {
		return ihat;
	}

	@Override
	public String getName() {
		return ihat.getName();
	}

	@Override
	public double getPrice() {
		
		return ihat.getPrice();
	}

	@Override
	public String getDescription() {
		
		return ihat.getDescription();
	}

}
