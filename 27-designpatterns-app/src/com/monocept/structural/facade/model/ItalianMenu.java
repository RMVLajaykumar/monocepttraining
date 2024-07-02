package com.monocept.structural.facade.model;

public class ItalianMenu implements Imenu {

	@Override
	public void dispalyMenu() {
		System.out.println("Risotto");
		System.out.println("Pizza");
		System.out.println("Pasta");
		System.out.println("Gnocchi");
		System.out.println("Pesto alla Genovese");
	}

}
