package com.monocept.adapter.model;

public class HatAdapter implements Iitems{
	
	
    Hat hat;
	@Override
	public String getItemName() {
		
		return hat.getLongname()+hat.getShortname() ;
	}

	@Override
	public int getItemPrice() {
		
		return hat.getBaseprice()+hat.getTax();
	}
	
	

}
