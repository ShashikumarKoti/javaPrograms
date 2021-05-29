package com.skoti.learning.executorservice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExecutor {
	final static int corePoolSize = 5;
	final static int maxPoolSize = 10;
	final static int keepAliveTime = 60;
	
	static BlockingQueue<Runnable> queue = new SynchronousQueue<Runnable>();
	
	public static void main(String[] args) {	
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, queue);
		
		for(int i=0;i<10;i++) {
		threadPoolExecutor.execute(new MyNewRunnable());
		}
		threadPoolExecutor.shutdown();
	}
}


class MyNewRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am from MyNewRunnable class, called by executor service by " + Thread.currentThread().getName());
	}
}