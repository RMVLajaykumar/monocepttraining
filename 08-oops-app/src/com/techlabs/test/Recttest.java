package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.oops.Rect;

public class Recttest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Rect rect=new Rect();
		System.out.println("enter width: ");
		int width=scanner.nextInt();
		rect.setWidth(width);
		System.out.println("enter height: ");
		int height=scanner.nextInt();
		rect.setHeight(height);
		System.out.println("rectangle details are:");
		System.out.println("width of rectangle is :"+rect.getWidth());
		System.out.println("height of rectangle is:"+rect.getHeight());
		rect.rectArea();



	}

}
