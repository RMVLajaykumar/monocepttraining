package com.monocept.test;

import com.monocept.model.Person;

public class Buildertest {

	public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("Ajay")
                .build();
		System.out.println(person);
		Person person2 = new Person.PersonBuilder()
                .setAge(20)
                .build();
		System.out.println(person2);

	}

}