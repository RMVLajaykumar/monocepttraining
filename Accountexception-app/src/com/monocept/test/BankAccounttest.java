package com.monocept.test;

import java.util.Scanner;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;
import com.monocept.model.BankAccount;

public class BankAccounttest {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		try {
		BankAccount account1=new BankAccount();
		System.out.println("enter amount");
		account1.setAmount(scanner.nextDouble());
		account1.deposit();
		}
		catch(NegativeAmountException e) {
			System.out.println(e.giveMessage());
		}
		try {
		BankAccount account2=new BankAccount();
		System.out.println("enter amount");
		account2.setAmount(scanner.nextDouble());
		account2.setBalance(2000);
		account2.withdraw();
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
