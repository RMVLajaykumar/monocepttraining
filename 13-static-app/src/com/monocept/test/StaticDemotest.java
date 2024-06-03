package com.monocept.test;

import com.monocept.staticmodel.StaticDemo;

public class StaticDemotest {

	public static void main(String[] args) {
		
		StaticDemo demo1=new StaticDemo();
		demo1.Display();
		StaticDemo demo2=new StaticDemo();
		demo2.Display();
		StaticDemo demo3=new StaticDemo();
		demo3.Display();
		StaticDemo.print();
		
		
		
		demo1.StaticIncrement();
		demo1.Display();
		demo2.StaticIncrement();
		demo2.Display();
		demo3.StaticIncrement();
		demo3.Display();

		
		
		

	}
	
	
	static {
		//StaticDemo demo=new StaticDemo();
		System.out.println("static created 1");
	}
	

}
