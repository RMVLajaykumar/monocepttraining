package com.monocept.test;

import com.monocept.model.Add;

public class Addtest {

	public static void main(String[] args) {
		
		System.out.println(fun((int a,int b)->{ return a+b;}));
		//Add add=(int a,int b)->{ return a+b;};
		
		//System.out.println(add.add(10, 20));

	}

	private static int  fun(Add add) {
		return add.add(10, 20);
		
		
	}

}
