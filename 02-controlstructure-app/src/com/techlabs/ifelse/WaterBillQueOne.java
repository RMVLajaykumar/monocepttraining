package com.techlabs.ifelse;

import java.util.Scanner;

public class WaterBillQueOne {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no of units:");
		int units=scanner.nextInt();
		int meter_charge=75;
		int charge=0;
		if(units<=100)
			charge=units*5;
		else if(units>100 && units<=250)
			charge=units*10;
		else
			charge=units*20;
     int totalwaterbill=0;
     totalwaterbill=charge+meter_charge;
     System.out.println("Total Water Bill : "+totalwaterbill);
	}

}
