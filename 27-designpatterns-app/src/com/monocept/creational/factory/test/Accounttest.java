package com.monocept.creational.factory.test;

import java.util.Scanner;

import com.monocept.creational.factory.model.AccountFactory;
import com.monocept.creational.factory.model.CurrentAccount;
import com.monocept.creational.factory.model.IAccount;
import com.monocept.creational.factory.model.SavingsAccount;

public class Accounttest {

	public static void main(String[] args) {
		
		SavingsAccount savings=(SavingsAccount) AccountFactory.getAccount("savings");
		CurrentAccount current=(CurrentAccount) AccountFactory.getAccount("current");
		Scanner scanner=new Scanner(System.in);
		System.out.println("welcome select your account");
		boolean exit=false;
		while(!exit) {
		
			System.out.println("enter \n1.savings account.\n2.current account.\n3.exit");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter account details");
				accountdetails(scanner,savings);
				boolean exits=false;
				while(!exits){
				System.out.println("enter \n1.display details\n2.credit\n3.debit\n4.exit.");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:
					displayDetails(savings);
					break;
				case 2:
					System.out.println("enter amount to credit");
					savings.credit(scanner.nextDouble());
					break;
				case 3:
					System.out.println("enter amount to debit");
					savings.debit(scanner.nextDouble());
					break;
				case 4:
					exits=true;
					System.out.println("thanks");
					break;
				}	
				
				}
				break;
				
			case 2:
				System.out.println("enter account details");
				acountdetail(scanner,current);
				boolean exits1=false;
				while(!exits1){
					System.out.println("enter \n1.display details\n2.credit\n3.debit\n4.exit");
					int choice=scanner.nextInt();
					switch(choice) {
					case 1:
						displayDetail(current);
						break;
					case 2:
						System.out.println("enter amount to credit");
						current.credit(scanner.nextDouble());
						break;
					case 3:
						System.out.println("enter amount to debit");
						current.debit(scanner.nextDouble());
						break;
					case 4:
						exits1=true;
						System.out.println("thanks");
						break;
					}	
					}
				break;
			case 3:
				exit=true;
				System.out.println("thankyou!!!");
				break;
				
					
				}
			}
			
			}
		


	
	private static void displayDetail(CurrentAccount current) {
		System.out.println(current.getAccountno());
		System.out.println(current.getOverdraftlimit());
	}




	private static void acountdetail(Scanner scanner, CurrentAccount current) {
		System.out.println("enter your account no:");
		 current.setAccountno(scanner.nextInt());
		 System.out.println("enter overdraftlimit");
		 current.setOverdraftlimit(scanner.nextDouble());
		
	}




	private static void displayDetails(SavingsAccount savings) {
		
		 System.out.println(savings.getAccountno());
		 System.out.println(savings.getName());
		 System.out.println(savings.getBalance());
		
	}


	public static void accountdetails(Scanner scanner,SavingsAccount savings) {
		
		System.out.println("enter your account no:");
		 savings.setAccountno(scanner.nextInt());
		System.out.println("enter name");
		savings.setName(scanner.next());
		System.out.println("enter balance");
		savings.setBalance(scanner.nextDouble());
		
		
	}

}
