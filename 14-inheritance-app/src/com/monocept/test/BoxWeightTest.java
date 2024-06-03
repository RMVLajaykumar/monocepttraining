package com.monocept.test;

import com.monocept.model.Boxweight;

public class BoxWeightTest {

	public static void main(String[] args) {
		Boxweight boxweight=new Boxweight(10,15,20,100);
		
		System.out.println("height:"+boxweight.getHeight());
		System.out.println("width:"+boxweight.getWidth());
		System.out.println("deepth:"+boxweight.getDeepth());
	    System.out.println("weight:"+boxweight.getWeight());
	}

}
