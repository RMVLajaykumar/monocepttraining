package com.monocept.singleton.model;

public class DatabaseManager {
	
	private static DatabaseManager dbmanager;
	private DatabaseManager() {
		
	}
	
	
	public static DatabaseManager getDatabase() {
		if(dbmanager==null) {
			dbmanager=new DatabaseManager();
		}
		return dbmanager;
	}
	
	
	public static String getMessage() {
		return "database created";
	}

}
