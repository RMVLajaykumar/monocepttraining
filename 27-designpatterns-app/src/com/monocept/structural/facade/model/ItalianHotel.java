package com.monocept.structural.facade.model;

public class ItalianHotel implements IHotel{

	@Override
	public Imenu getMenu() {
		
		return new ItalianMenu();
	}

}
