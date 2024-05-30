package com.techlabs.test;

import com.techlabs.model.Rectangle;

public class Rectangletest {

	public static void main(String[] args) {
		
		Rectangle rectangle1=new Rectangle();
		System.out.println("width of the rectangle is:"+rectangle1.getWidth()+"\n"+"height of the rectangle is:"+rectangle1.getHeight());
		Rectangle rectangle2=new Rectangle(10,20);
		System.out.println("width of the rectangle2 is:"+rectangle2.getWidth()+"\n"+"height of the rectangle2 is:"+rectangle2.getHeight());
		Rectangle rectangle3=new Rectangle(3);
		System.out.println("width of the rectangle3 is:"+rectangle3.getWidth()+"\n"+"height of the rectangle3 is:"+rectangle3.getHeight());
		



	}

}
