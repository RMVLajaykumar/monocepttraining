package com.techlabs.test;

import com.techlabs.model.Point;

public class Pointtest {

	public static void main(String[] args) {
		
		Point point=new Point();
		System.out.println("point1");
		System.out.println("("+point.getX()+","+point.getY()+")");
		point.setX(20);
		point.setY(25);
		System.out.println("point2");
		System.out.println("("+point.getX()+","+point.getY()+")");
		Point point2=new Point(23,22);
		System.out.println("("+point2.getX()+","+point2.getY()+")");
		Point point3=new Point(point2);
		System.out.println("("+point3.getX()+","+point3.getY()+")");
		
		
		

	}

}
