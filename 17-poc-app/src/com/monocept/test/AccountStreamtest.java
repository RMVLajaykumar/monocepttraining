package com.monocept.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccountStreamtest {

	public static void main(String[] args) {
		List<AccountStream>accounts =new ArrayList<>();
		accounts.add(new AccountStream(1,"Ajay",1234543));
		accounts.add(new AccountStream(2,"kumar",12340));
		accounts.add(new AccountStream(3,"akrmvl",1220));
		accounts.add(new AccountStream(1,"rmvl",1232752));
		
		accounts.stream().filter((x)->x.getBalance()<2000)
		.forEach((x)->System.out.println(x));
		
	}

}
