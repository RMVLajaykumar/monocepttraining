package com.monocept.creational.factory.test;

import com.monocept.creational.factory.model.CarFactory;
import com.monocept.creational.factory.model.Icar;
import com.monocept.creational.factory.model.Mahindra;
import com.monocept.creational.factory.model.Maruti;
import com.monocept.creational.factory.model.Tata;

public class IcarTest {

	public static void main(String[] args) {
		Icar car;
		car= CarFactory.getcar("maruti");
		car.start();
		car.stop();
		car= CarFactory.getcar("mahindra");
		car.start();
		car.stop();
		car=CarFactory.getcar("tata");
	    car.start();
	    car.stop();

	}

}
