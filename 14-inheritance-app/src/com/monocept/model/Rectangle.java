package com.monocept.model;

public class Rectangle extends Shape{
	
	private int height;
	private int width;


	public void area() {
		System.out.println("Area of rectangle is:"+height*width);
	}


	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

}
