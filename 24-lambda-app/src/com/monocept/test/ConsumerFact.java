package com.monocept.test;

import java.util.function.Consumer;

public class ConsumerFact {

	public static void main(String[] args) {
		Consumer<Integer> consumer =(arg)-> {
				int fact=1;
				for(int i=1;i<=arg;i++) {
					fact=fact*i;
				}
				System.out.println(fact);			
	};
	consumer.accept(5);

}}
