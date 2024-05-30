package com.techlabs.stream;
import java.util.Scanner;
public class Aja {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter player1 name:");
		String name=input.next();
		int[] player1=playGame(0,0);
		System.out.println("Enter player2 name:");
		String name2=input.next();
		int[] player2=playGame(0,0);
	     int player1score=player1[0];
	     int player1turns=player1[1];
	     int player2score=player2[0];
	     int player2turns=player2[1];
	     if(player1score<player2score)
	    	 System.out.println(name2+"is winner");
	     else if(player1score>player2score)
	    	 System.out.println(name+"is winner");
	     else if(player1turns>player2turns)
	    	 System.out.println(name2+"is winner");
	     else if(player1turns<player2turns)
	    	 System.out.println(name+"is winner");
	}

	private static int[] playGame(int score, int turns) {
		Scanner input=new Scanner(System.in);
		int player2[]=new int[2];
		int score1 = 0;
        int noOfTurns1 = 0;
        while (noOfTurns1<=300) {
            System.out.println("Enter y/n");
            String choice = input.next();
            if (choice.equals("n")) {
                break;
            } else if (choice.equals("y")) {
                int page = (int) (Math.random() * 300) + 1;
                System.out.println("Page no generated: " + page);
                int run = page % 7;
                System.out.println("Score: " + run);
                if (run == 0) {
                    System.out.println("Out");
                    noOfTurns1++;
                  player2[0]=score1;
                  player2[1]=noOfTurns1;
                    break;
                } else {
                    score1 += run;
                    noOfTurns1++;
                }
            }
        }
        player2[0]=score1;
        player2[1]=noOfTurns1;
		return player2;
	}

}
