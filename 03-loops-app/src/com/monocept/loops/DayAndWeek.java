package com.monocept.loops;

import java.util.Scanner;

public class DayAndWeek {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a  day number:");
		int number=scanner.nextInt();
		
		switch(number)
		{
		case 1:System.out.println("its sunday");
		       break;
		case 2:System.out.println("its Monday");
		       break;
		case 3:System.out.println("its tuesday");
		       break;
		case 4:System.out.println("its wednesday");
		       break;
		case 5:System.out.println("its thursday");
		       break;
		case 6:System.out.println("its friday");
		        break;
		case 7:System.out.println("its saturday");
	            break;
		default:System.out.println("please enter a valid number");
		
		

	}

}
}
