package com.monocept.creational.abstraction.test;

import com.monocept.creational.abstraction.model.ICarFactory;
import com.monocept.creational.abstraction.model.ICars;
import com.monocept.creational.abstraction.model.MarutiFactory;

public class Carfactorytest {

	public static void main(String[] args) {
		ICarFactory marutiFactory=new MarutiFactory();
		ICars maruti=marutiFactory.makeCar();
		maruti.start();
		maruti.stop();

		

	}

}
