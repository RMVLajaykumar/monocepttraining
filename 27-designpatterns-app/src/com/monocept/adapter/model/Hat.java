package com.monocept.adapter.model;

public class Hat {
	
	private String shortname;
	private String Longname;
	private int baseprice;
	private int tax;
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongname() {
		return Longname;
	}
	public void setLongname(String longname) {
		Longname = longname;
	}
	public int getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}
	public int getTax() {
		return tax;
	}
	public void setTax( int tax) {
		this.tax = tax;
	}
	public Hat(String shortname, String longname, int baseprice, int tax) {
		super();
		this.shortname = shortname;
		Longname = longname;
		this.baseprice = baseprice;
		this.tax = tax;
	}
	public Hat() {
		super();
	}
	
	

}
