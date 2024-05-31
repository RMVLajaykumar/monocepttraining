package com.monocept.stream;
import java.util.Scanner;
public class BookCricket {
    public static void main(String[] args) {
    	//player1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player no 1");
        String name1 = scanner.next();
        System.out.println(name1 + " starts playing");
        int score1 = 0;
        int noOfTurns1 = 0;
        while (true) {
            System.out.println("Enter y/n");
            String choice = scanner.next();
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
                    break;
                } else {
                    score1 += run;
                    noOfTurns1++;
                }
            }
        }
        System.out.println(name1 + "'s total score: " + score1 + " in " + noOfTurns1 + " turns");
        //player2
        System.out.println("Enter player no 2");
        String name2 = scanner.next();
        System.out.println(name2 + " starts playing");
        int score2 = 0;
        int noOfTurns2 = 0;
        while (true) {
            System.out.println("Enter y/n");
            String choice = scanner.next();
            if (choice.equals("n")) {
                break;
            } else if (choice.equals("y")) {
                int page = (int) (Math.random() * 300) + 1;
                System.out.println("Page no generated: " + page);
                int run = page % 7;
                System.out.println("Score: " + run);
                if (run == 0) {
                    System.out.println("Out");
                    noOfTurns2++;
                    break;
                } else {
                    score2 += run;
                    noOfTurns2++;
                }
                if (score2 > score1) {
                    break;
                }
            }
        }
        System.out.println(name2 + "'s total score: " + score2 + " in " + noOfTurns2 + " turns");
        if (score1 > score2) {
            System.out.println(name1 + " is the winner");
        } else if (score2 > score1) {
            System.out.println(name2 + " is the winner");
        } else {
            if (noOfTurns1 < noOfTurns2) {
                System.out.println(name1 + " is the winner");
            } else if (noOfTurns2 < noOfTurns1) {
                System.out.println(name2 + " is the winner");
            } else {
                System.out.println("It's a draw");
            }
        }
    }
}
