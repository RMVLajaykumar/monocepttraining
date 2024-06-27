package com.monocept.creational.factory.model;

public class CarFactory {
	
	private static Icar car;
	public static Icar getcar(String name) {
		if(name=="maruti")
			car=new Maruti();
		if(name=="tata")
			car=new Tata();
		if(name=="mahindra")
			car=new Mahindra();
		
	return car;
		
		
		
	}

}
