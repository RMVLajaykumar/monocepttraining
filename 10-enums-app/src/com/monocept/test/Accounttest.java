package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;
import com.monocept.model.AccountType;

public class Accounttest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Account accounts[]=new Account[3];
		for(int i=0;i<accounts.length;i++) {
		accounts[i]=new Account();
		System.out.println("enter account number:");
		accounts[i].setAccountno(scanner.nextInt());
		System.out.println("enter Account holder name");
		accounts[i].setName(scanner.next());
		System.out.println("enter balance");
		accounts[i].setBalance(scanner.nextDouble());
		System.out.println("enter accounttype-for savings press: 1 and for current press:2");
		int accountType=scanner.nextInt();
		if (accountType==1)
		accounts[i].setAccounttype(AccountType.savings);
		if(accountType==2)
	    accounts[i].setAccounttype(AccountType.current);
		}
		
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i]);
		}

	}

}
