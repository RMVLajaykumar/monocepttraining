package com.monocept.e;

import java.util.Scanner;

public class Seasons {
	enum Wheather{
		january,february,march,april,may,june,july,augest,september,october,november,december;
	}

	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a month number");
		int n=scanner.nextInt();
		switch(n)
		{
		case 1:
			System.out.println(Wheather.january+":its Winter");
			break;
		case 2:
			System.out.println(Wheather.february+":its Winter");
			break;
		case 3:
			System.out.println(Wheather.march+":its Summer");
			break;
		case 4:
			System.out.println(Wheather.april+":its Summer");
			break;
		case 5:
			System.out.println(Wheather.may+":its Summer");
			break;
		case 6:
			System.out.println(Wheather.june+":its Rainy");
			break;
		case 7:
			System.out.println(Wheather.july+":its Rainy");
			break;
		case 9:
			System.out.println(Wheather.september+":its Rainy");
			break;
		case 8:
			System.out.println(Wheather.augest+":its Rainy");
			break;
		case 10:
			System.out.println(Wheather.october+":its postmoonsoon");
			break;
		case 11:
			System.out.println(Wheather.november+":its postmoonsoon");
			break;
		case 12:
			System.out.println(Wheather.december+":its winter");
			break;
		
		
		}


	}

}
