package com.monocept.test;

import com.monocept.model.Caller;
import com.monocept.model.Callme;

public class Callertest {

	public static void main(String[] args) {
		Callme target = new Callme();
		
		Caller caller1 = new Caller("hello",target);
		
		Caller caller2 = new Caller("swabhav",target);
		
		Caller caller3 = new Caller("techlabs",target);
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();	
		}
		catch(InterruptedException e) {
			System.out.println("Thread interupted");	
		}

	}

}
