package com.monocept.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.monocept.model.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Person> person = new ArrayList<Person>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many persons do you want to add!!");
		int size = scanner.nextInt();
		for(int i=0;i<size;i++) {
		System.out.println("enter  new name");
		String name= scanner.next();
		System.out.println("enter  new age");
		int age = scanner.nextInt();
		System.out.println("enter new address");
		String address = scanner.next();
		Person person1=new Person(name,age,address);
		person.add(person1);
		}
		giveDetails(person);
		
	     
		details(0,person,scanner);
		giveDetails(person);
		
		
		System.out.println();
		
		details(person.size(),person,scanner);
		giveDetails(person);
		
		details(2,person,scanner);
		giveDetails(person);
		
		System.out.println();
		System.out.println("details of 5th person is:"+person.get(4));
		System.out.println("details of 1st person is:"+person.get(0));
		System.out.println("details of last person is:"+person.get(person.size()-1));
		
		System.out.println("enter new name");
		String name= scanner.next();
		System.out.println("enter new age");
		int age = scanner.nextInt();
		System.out.println("enter new address");
		String address = scanner.next();
		
		Person person5=new Person(name,age,address);
		person.set(2, person5);
		System.out.println(person5);
		System.out.println();
		//removing 2 persons details.
		person.remove(1);
		person.remove(3);
		System.out.println("2 elements are removed \n");
		giveDetails(person);
		System.out.println();
		//searching a particular person exists in list or not!!
		existPerson(person,scanner);
	    //printing the index value based on name
		printingIndexOfPerson(person,scanner);
		
		
		for(int i=0;i<person.size();i++) {
			System.out.println(person.get(i));
		}
		System.out.println();
		for(Person person1:person) {
			System.out.println(person1);
		}
		person.clear();
		System.out.println();
		System.out.println(person+"\n");
	    if(person.isEmpty()) {
		  System.out.println("Arraylist is empty!!!");
	  }
	    if(!person.isEmpty()) {
			  System.out.println("Arraylist is not empty!!!");
		  } 
	}
	
	
	
	private static void printingIndexOfPerson(ArrayList<Person> person, Scanner scanner) {
		System.out.println("enter the name that you want to print its index:");
		String name3=scanner.next();
		boolean exists=false;
		for(Person persons:person) {
			if(persons.getName().equals(name3)) {
				System.out.println(name3+" person exists in index value of :"+person.indexOf(persons)+"\n");
				exists=true;
				break;
			}	
			}
		if(!exists) {
			System.out.println("sorry that person does not exist \n");
		}	
	}
	private static void existPerson(ArrayList<Person> person, Scanner scanner) {
	
		System.out.println("enter the name that you want to search");
		String name2=scanner.next();
		boolean exists=false;
		for(Person persons:person) {
			if(persons.getName().equals(name2)) {	
				System.out.println("yes person exists in list.\n");
				exists=true;
				break;
			}
		}
		if(!exists) {
			System.out.println("sorry that person does not exist \n");
		}
			
		}
	private static void giveDetails(ArrayList<Person> person) {
		for(Person person1:person) {
			System.out.println(person1);
		}
	}
	private static void details(int i, ArrayList<Person> person, Scanner scanner) {
		System.out.println("enter name");
		String name= scanner.next();
		System.out.println("enter age");
		int age = scanner.nextInt();
		System.out.println("enter address");
		String address = scanner.next();
		person.add(i,new Person(name,age,address));		
	}


}
