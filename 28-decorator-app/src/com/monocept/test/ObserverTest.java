package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.AlreadyExistException;
import com.monocept.model.Emailnotifier;
import com.monocept.model.NotExistNotifierException;
import com.monocept.model.SmsNotifier;

public class ObserverTest {

	public static void main(String[] args) {
		try {
		Account account = new Account(101, "AJAY", 5000);
		System.out.println(account);
		account.registerUser(new Emailnotifier());
		account.registerUser(new Emailnotifier());

		account.withDraw(2000);

		System.out.println("--------");
		account.registerUser(new SmsNotifier());
		account.deposit(10000);
		}
		catch(AlreadyExistException e) {
			System.out.println(e.getMessage());
		}
		try {
			Account account = new Account(101, "AJAY", 5000);
			System.out.println(account);
			account.deregisterUser(new Emailnotifier());
			account.deregisterUser(new Emailnotifier());

			account.withDraw(2000);

		}
		catch(NotExistNotifierException e) {
			System.out.println(e.getMessage());
		}

	}
	

}
