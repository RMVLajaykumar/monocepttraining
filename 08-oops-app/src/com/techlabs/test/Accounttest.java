package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.oops.Account;

public class Accounttest {

	public static void main(String[] args) {
		Account act1=new Account();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter account1 details");
		System.out.println("enter account number: ");
		long accountno=scanner.nextLong();
		act1.setAccountno(accountno);
		System.out.println("enter account type: ");
		String accounttype=scanner.next();
		act1.setAccounttype(accounttype);
		System.out.println("enter name: ");
		String name=scanner.next();
		act1.setName(name);
		System.out.println("balance: ");
		double balance=scanner.nextInt();
		act1.setBalance(balance);
		System.out.println("account 1 details");
		System.out.println("id  number :"+act1.getAccountno());
		System.out.println("Accounttype:"+act1.getAccounttype());
		System.out.println("name is :"+act1.getName());
		System.out.println("balance :"+act1.getBalance());
	
		Account act2=new Account();
		System.out.println("enter account2 details");
		System.out.println("enter account number: ");
		accountno=scanner.nextLong();
		act2.setAccountno(accountno);
		System.out.println("enter account type: ");
		accounttype=scanner.next();
		act2.setAccounttype(accounttype);
		System.out.println("enter name: ");
		 name=scanner.next();
		act2.setName(name);
		System.out.println("balance: ");
		balance=scanner.nextInt();
		act2.setBalance(balance);
		System.out.println("account 2 details");
		System.out.println("id  number :"+act2.getAccountno());
		System.out.println("Accounttype:"+act2.getAccounttype());
		System.out.println("name is :"+act2.getName());
		System.out.println("balance :"+act2.getBalance());

}
	}


