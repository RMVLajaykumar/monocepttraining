package com.monocept.oc;

import java.util.Scanner;

public class PigGame {
	static int score=0;
	static int total_score=0;
	static int no_of_turns = 0;

	public static void main(String[] args) {
		diceRolled();
		displayresult();
	}

	private static void diceRolled() {
		while(total_score<20) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("choose roll or hold");
			String selection=scanner.next();
			if(selection.equals("roll"))
			choiceRoll();
			if(selection.equals("hold"))
			chioceHold();
		}
		
	}

	private static void displayresult() {
		System.out.println("you won !");
        System.out.println("Total score: " + total_score);
        System.out.println("Total number of turns: " + no_of_turns);
		
	}

	private static void choiceRoll() {
		int diceRolled=(int)(Math.random()*(6))+1;
		System.out.println("dice:"+diceRolled);
		if(diceRolled==1) {
			no_of_turns++;
			score=0;
			System.out.println("turnover no score");
		return;
		}
	   score+=diceRolled;
			
	}
	private static int chioceHold() {
		no_of_turns+=1;
		total_score+=score;
		System.out.println("score for turn "+no_of_turns+" : " + score+ "\nTotal score : "+total_score);
		score=0;
		return total_score;
	}
	
}
