package com.techlabs.test;

import com.techlabs.model.Account;

public class Accounttest {

	public static void main(String[] args) {
		
		
		Account account=new Account();
		System.out.println("("+account.getAccountno()+","+account.getAccounttype()+","+account.getName()+","+account.getBalance()+")");
		Account account1=new Account();
		account1.setAccountno(543295432);
		account1.setAccounttype("Savings");
		account1.setName("Ajay");
		account1.setBalance(5432121);
		System.out.println("("+account1.getAccountno()+","+account1.getAccounttype()+","+account1.getName()+","+account1.getBalance()+")");
		Account account2=new Account(4321312,"current","kumar",654321);
		System.out.println("("+account2.getAccountno()+","+account2.getAccounttype()+","+account2.getName()+","+account2.getBalance()+")");
			
		

	}

}
