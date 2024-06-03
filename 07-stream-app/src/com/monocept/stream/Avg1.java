package com.monocept.stream;

import java.util.HashSet;
import java.util.Scanner;

public class Avg1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum / n;
        System.out.println("Average of elements is: " + average);

        boolean pairExists = false;
        HashSet<Double> foundElements = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            double target = average - array[i];
            if (foundElements.contains(target)) {
                pairExists = true;
                break;
            }
            foundElements.add((double) array[i]);
        }

        System.out.println("Pair of elements with sum equal to the average exists: " + pairExists);
        
    }
}


