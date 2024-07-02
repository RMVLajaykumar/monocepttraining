package com.monocept.test;

import com.monocept.model.CarInspection;
import com.monocept.model.OilChange;
import com.monocept.model.WheelAlign;

public class CarTest {

	public static void main(String[] args) {
		CarInspection ci=new CarInspection() ;
		System.out.println(ci.getCost());
		System.out.println("-----------");
		OilChange oc= new OilChange(ci);
		System.out.println(oc.getCost());
		System.out.println("---------");
		WheelAlign wa=new WheelAlign(ci);
		System.out.println(wa.getCost());

	}

}
