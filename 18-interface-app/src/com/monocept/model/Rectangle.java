package com.monocept.model;

public class Rectangle implements Shape {
	
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		
		this.height = height;
		this.width = width;
	}
	
	public void area() {
		System.out.println("Area of rectangle is:"+height*width);
		
	}
	
	public void perimeter() {
		System.out.println("perimeter of rectangle is:"+2*(height+width));
		
	}
	

}
