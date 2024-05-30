package com.techlabs.oops;

public class Rect {
	
	private int width;
	private int height;
	private int area;
	
	public void setWidth(int width1) {
		width=width1;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height1) {
		height=height1;
	}
	public int getHeight() {
		return height;
	}
	public void rectArea() {
		area=getHeight()*getWidth();
		System.out.println("Area of rectangle is:"+area);
	}
}
