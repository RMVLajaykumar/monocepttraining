package com.monocept.singleton.test;

import com.monocept.singleton.model.DatabaseManager;

public class DbTest {

	public static void main(String[] args) {
		DatabaseManager dbmanager= DatabaseManager.getDatabase();
		System.out.println(dbmanager.getMessage());

	}

}
