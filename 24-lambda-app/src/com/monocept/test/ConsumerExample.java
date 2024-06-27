package com.monocept.test;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerExample::printMessage;
        consumer.accept("Hello,good morning how are you ok byee");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

