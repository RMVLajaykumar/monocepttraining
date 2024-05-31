package com.monocept.ifelse;

import java.util.Scanner;

public class TressureHuntApp {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Treasure Island Your mission is to find the treasure");
		System.out.println("Choose either Right or Left:");
		String direction=scanner.nextLine();
		if (direction.equals("Left")) {
			System.out.println("Choose either to Swim or Wait");
			String action=scanner.nextLine();
			if (action.equals("Wait")) {
				System.out.println("Choose a door:");
				String door=scanner.nextLine();
				if (door.equals("Red")) {
					System.out.println("Burned by Fire.");
					System.out.println("Game Over.");
				}
				else if (door.equals("Blue")) {
					System.out.println("Eaten by beasts.");
					System.out.println("Game Over.");
				}
				else if (door.equals("Yellow")) {
					System.out.println("You Win!");
				}
				else {
					System.out.println("Game Over.");
				}
			}
			else {
				System.out.println("Attacked by trout.");
				System.out.println("Game Over.");
			}
		}
		else {
			System.out.println("Fall into a hole.");
			System.out.println("Game Over.");
		}

	}

}

	