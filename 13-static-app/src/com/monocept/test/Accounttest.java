package com.monocept.test;

import com.monocept.staticmodel.Account;

public class Accounttest {

	public static void main(String[] args) {
		Account account=new Account(65432123,"Ajay",654321);
		account.AccountIncremment();
		account.displayDetails();
		System.out.print("Account creation is :");
		account.Display();
		
		Account account2=new Account(65433,"kumar",6544321);
		account2.AccountIncremment();
		account2.displayDetails();
		System.out.print("Account creation is :");
		account2.Display();
		
		Account account3=new Account(654333,"aa",4321);
		account3.AccountIncremment();
		account3.displayDetails();
		System.out.print("Account creation is :");
		account3.Display();
		
		System.out.print("total no of account creation is:");
		account3.Display();
		
		
		
		

	}

}
