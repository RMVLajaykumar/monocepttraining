package com.monocept.test;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;

import com.monocept.model.Task;

public class DemoTaskTest {

	public static void main(String[] args) {
		//int count = Runtime.getRuntime().availableProcessors();
		//System.out.println(count);
		//ExecutorService service = Executors.newFixedThreadPool(7);
		//ExecutorService service = Executors.newCachedThreadPool();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(7);
for(int i=0;i<10;i++) {
			
		//service.schedule(new Task(),5,TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new Task(), 0, 10, TimeUnit.SECONDS);
		//service.scheduleAtFixedRate(new Task(), 0, 10, TimeUnit.SECONDS);
}
		
	

		
	}

}
