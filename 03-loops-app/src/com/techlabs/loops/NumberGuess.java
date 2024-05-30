package com.techlabs.loops;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no_of_chances=10;
		int computer_guess=(int)(Math.random()*100)+1;
		while(no_of_chances>0) {
			System.out.println("Enter a number between 1-100");
			int input=scanner.nextInt();
			if (computer_guess==input) {
				System.out.println("You won");
				break;		
			}
			else if(computer_guess<input) {
				System.out.println("input is too high");
			}
			else if(computer_guess>input) {
				System.out.println("input is too low");
			}
		}
		System.out.println(" You have completed no of chances");
		

	}

}
