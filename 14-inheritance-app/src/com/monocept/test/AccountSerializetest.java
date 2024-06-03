package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.monocept.model.AccountSerialize;

public class AccountSerializetest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AccountSerialize account=new AccountSerialize();
		account.setAccountno(scanner.nextLong());
		account.setName(scanner.next());
		account.setBalance(scanner.nextDouble());
		try {
			FileOutputStream object1=new FileOutputStream("D:\\assignments\\14-inheritance-app\\src\\com\\monocept\\test\\Ak.txt");
			ObjectOutputStream object2=new ObjectOutputStream(object1);
			object2.writeObject(account);
			System.out.println("Object has been serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
