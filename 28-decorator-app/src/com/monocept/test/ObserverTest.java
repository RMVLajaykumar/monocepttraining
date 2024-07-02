package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.Emailnotifier;
import com.monocept.model.SmsNotifier;

public class ObserverTest {

	public static void main(String[] args) {
		Account account = new Account(101, "AJAY", 5000);
		System.out.println(account);
		account.registerUser(new Emailnotifier());
		account.registerUser(new Emailnotifier());

		account.withDraw(2000);

		System.out.println("--------");
		account.registerUser(new SmsNotifier());
		account.deposit(10000);

	}

}
