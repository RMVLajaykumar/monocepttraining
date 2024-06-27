package com.monocept.test;

import com.monocept.model.MyThread;

public class MyThreadDemo  {

	public static void main(String[] args) {
		
	Thread.currentThread().setPriority(1);
		
		MyThread thread1=new MyThread("myThread1");
		MyThread thread2=new MyThread("myThread2");
		MyThread thread3=new MyThread("myThread3");
		
		thread2.setPriority(9);
		thread1.setPriority(1);
		thread3.setPriority(2);
		
		for(int i=3;i>0;i--) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
