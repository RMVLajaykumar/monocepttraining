package com.monocept.model;

public class Box {
	
	private double width;
	private double height;
	private double deepth;
	public Box() {
	}
	
	public Box(double width, double height, double deepth) {
		this.width = width;
		this.height = height;
		this.deepth = deepth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDeepth() {
		return deepth;
	}
	public void setDeepth(double deepth) {
		this.deepth = deepth;
	}
	
	
}
