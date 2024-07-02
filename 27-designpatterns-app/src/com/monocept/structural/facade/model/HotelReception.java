package com.monocept.structural.facade.model;

public class HotelReception {
	
	public void getIndianMenu() {
		IHotel indhotel = new IndianHotel();
		Imenu menu=indhotel.getMenu();
		menu.dispalyMenu();
		
	}
	
	public void getItalianMenu() {
		IHotel italianhotel = new ItalianHotel();
		Imenu menu1=italianhotel.getMenu();
		menu1.dispalyMenu();
		
	}

}
