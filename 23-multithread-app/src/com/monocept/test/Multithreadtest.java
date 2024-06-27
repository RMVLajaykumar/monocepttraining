package com.monocept.test;

public class Multithreadtest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread thread = Thread.currentThread();
		thread.setName("mainthread");
		
		System.out.println(thread);
		
		for(int i=5;i>=0;i--) {
			System.out.println(thread.getName()+" : "+i);
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}

	}


