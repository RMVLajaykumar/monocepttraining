package com.monocept.forloop;

import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		int score=0;
		int totalScore=0;
		int noOfTurns=0;
		System.out.println("here r is roll and h is hold");
		while(totalScore<20) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("choose roll or hold");
			String choice=scanner.next();
			if (choice.equals("hold")) {
				noOfTurns+=1;
				totalScore+=score;
				System.out.println("turns and score "+":"+noOfTurns+" , " + score+ "\nTotal score : "+totalScore);
				score=0;
			}
			else if (choice.equals("roll")){
				int dicerolled=(int)(Math.random()*(6))+1;
				System.out.println("dice:"+dicerolled);
				if(dicerolled!=1) {
					score+=dicerolled;
					
				}
				else {
					noOfTurns+=1;
					System.out.println("turnover no score");
					score=0;
				}
			}
		}
		System.out.println("You won\n No of turns "+noOfTurns);

	}
}
