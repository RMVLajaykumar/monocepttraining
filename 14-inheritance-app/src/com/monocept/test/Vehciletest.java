package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Car;

public class Vehciletest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of cars");
		int n=scanner.nextInt();
		Car car[]=new Car[n];
		for(int i=0;i<n;i++) {
			car[i]=new Car();
			System.out.println("enter car company name");
			car[i].setCompanyname(scanner.next());
			System.out.println("enter car mileage");
			car[i].setMilege(scanner.nextDouble());
			System.out.println("enter car price:");
			car[i].setPrice(scanner.nextDouble());
		}
		for(int i=0;i<n;i++) {
			System.out.println("car company :" +(i+1));
			System.out.println("car company is:"+car[i].getCompanyname());
			System.out.println("car mileage is:"+car[i].getMilege());
			System.out.println("car price is:"+car[i].getPrice());
		}
	}
}