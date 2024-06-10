package com.monocept.model;

public class Circle implements Shape {
	
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle is:"+3.14*radius*radius);
		
	}

	public void perimeter() {
		System.out.println("perimeter of circle is:"+2*3.14*radius);
		
	}

}
