package com.monocept.adapter.model;

public class Chocolate implements Iitems {
	private String name;
    private int mrp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public Chocolate() {
		super();
	}
	public Chocolate(String name, int mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}
	@Override
	public String getItemName() {
		return this.name;
		
		
	}
	@Override
	public int getItemPrice() {
		return this.mrp;
		
		
	}
    

}
