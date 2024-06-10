package com.monocept.model;

public class Circle extends Shape{
	
	private int radius;


	public void area() {
		System.out.println("Area of circle :"+(3.14*radius*radius));	
	}


	public Circle(int radius) {
		this.radius = radius;
	}


}
