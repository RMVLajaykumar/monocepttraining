package com.monocept.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> consumer =(arg)->System.out.println(arg);
		
		consumer.accept(120);
		
		BiConsumer<Integer,Integer> biconsumer = (number1,number2)->
	           System.out.println("Addition"+(number1+number2));
	           
	          biconsumer.accept(10, 20);

	}

}
