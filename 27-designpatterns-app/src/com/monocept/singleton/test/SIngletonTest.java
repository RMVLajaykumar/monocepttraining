package com.monocept.singleton.test;

import com.monocept.singleton.model.Login;

public class SIngletonTest {

	public static void main(String[] args) {
		Login login=Login.getLogin();
		Login login1=Login.getLogin();
		System.out.println(login.hashCode());
		System.out.println(login1.hashCode());
		
		System.out.println(login.getMessage());

	}

}
