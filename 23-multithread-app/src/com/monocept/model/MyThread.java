package com.monocept.model;

public class MyThread extends Thread {
	
	private String name;

	public MyThread(String name) {
		super(name);
		this.name = name;
		start();
		
	}

	public void run() {
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
