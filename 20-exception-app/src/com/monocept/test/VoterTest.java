package com.monocept.test;

import com.monocept.exceptions.AgeNotValidException;
import com.monocept.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		try {
		Voter vote1=new Voter("ajay",21);
		vote1.vote();
		Voter vote2=new Voter("Raj",17);
		vote2.vote();
		}
		catch(AgeNotValidException e){
			System.out.println(e.getMessage());
			
		}
	

	}

}
