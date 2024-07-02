package com.monocept.structural.facade.model;

public class IndianHotel implements IHotel {

	@Override
	public Imenu getMenu() {
		
		return new IndianMenu();
	}

}
