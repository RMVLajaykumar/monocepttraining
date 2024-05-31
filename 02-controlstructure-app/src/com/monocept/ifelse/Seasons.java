package com.monocept.ifelse;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a  month number:");
		int number=scanner.nextInt();
		
		switch(number)
		{
		case 1:
		case 2:
		case 12:System.out.println("Winter");
		         break;
		case 3:
		case 4:
		case 5:System.out.println("Summer");
		         break;
		case 6:
		case 7:
		case 8:
		case 9:System.out.println("Rainy");
		         break;
		case 10:
		case 11:System.out.println("post_moonsoon");
		         break;
		 default:System.out.println("Enter a valid grade");
		

	}
	}
}


