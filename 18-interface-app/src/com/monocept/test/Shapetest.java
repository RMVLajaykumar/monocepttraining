package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;
import com.monocept.model.Shape;

public class Shapetest {

	public static void main(String[] args) {
		Shape shape;
		shape=new Circle(10);
		shape.area();
		shape.perimeter();
		shape=new Rectangle(10,20);
		shape.area();
		shape.perimeter();

	}

}
