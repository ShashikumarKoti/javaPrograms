package com.skoti.learning.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
	//	ExecutorService executorService = Executors.newFixedThreadPool(5);
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++) {
			Future<String> futureTask = executorService.submit(new MyCallable());
			String returnedValue = futureTask.get();
			//String returnedValue = futureTask.get(2, TimeUnit.SECONDS);
			boolean cancel = futureTask.cancel(true);
			System.out.println("Cancel is "+ cancel);
			System.out.println(returnedValue);
		}
		
		executorService.shutdown();
	}
}


class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return "I am from callable class, executed by "+ Thread.currentThread().getName();
	}
	
}