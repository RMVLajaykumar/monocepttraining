package com.monocept.test;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeTest {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(4);
//        System.out.println(deque.removeFirst()); 
//        System.out.println(deque.removeLast());  
//        System.out.println(deque.removeFirst()); 
//        System.out.println(deque.removeLast()); 
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.pollLast());
        System.out.println(deque);
       System.out.println( deque.size());
       
      
 
        
    }
}