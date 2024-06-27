package com.monocept.test;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Priorityqueue {
	    public static void main(String[] args) {  
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	        pq.add(10);
	        pq.add(20);
	        pq.add(15);
	        pq.add(22);
	        
	        System.out.println("PriorityQueue: " + pq);

//	        System.out.println("Peek: " + pq.peek()); 
//
//	        System.out.println("Removed: " + pq.poll()); 
//	        System.out.println("Removed: " + pq.poll()); 
//	        System.out.println("Removed: " + pq.poll()); 
	        pq.remove(10);
	        
	        System.out.println("PriorityQueue: " + pq);
	    }
	
}

