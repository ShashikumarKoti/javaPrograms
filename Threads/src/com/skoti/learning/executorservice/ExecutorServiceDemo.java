package com.skoti.learning.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
	//	ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<5;i++) {
		executorService.execute(new MyRunnable());  //creating 5 thread to execute
		}
		executorService.shutdown();
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("I am from Runnable class, called by executor service by " + Thread.currentThread().getName());
	}
}