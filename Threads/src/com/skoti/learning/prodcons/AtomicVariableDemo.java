package com.skoti.learning.prodcons;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicVariableDemo {

	static final int NUMER_OF_THREADS = 10;

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		System.out.println("Initial count: " + counter.getCount());

		UpdateThread[] threads = new UpdateThread[NUMER_OF_THREADS];
		for (int i = 0; i < NUMER_OF_THREADS; i++) {
			threads[i] = new UpdateThread(counter);
			threads[i].start();
		}

		for (int i = 0; i < NUMER_OF_THREADS; i++) {
			threads[i].join();
		}

		System.out.println("Final Counter = " + counter.getCount());
	}

}

class Counter {
	//private int value;

	AtomicInteger value = new AtomicInteger();
	
	//using explicit locking mechanism
	private Lock myLock = new ReentrantLock();
	
	//this method accessed by many thread and it is not synchronized. So leads in data inconsistency
//	public void increment() {  
//	System.out.println("Using synchronized method");
//		value++;
//	}

	// one way solving multi-thread issue is by adding synchronized to this method
//	public synchronized void  increment() {  
//	System.out.println("Using synchronized method");
//		value++;
//	}

	//using explicit locking mechanism
//	public void increment() {
//		System.out.println("Using reenrant lock");
//		myLock.lock();
//		value++;
//		myLock.unlock();
//	}

//	public void decrement() {
//		value--;
//	}

//	public int getCount() {
//		return value;
//	}
	
	//Using atomicInteger methods to increment/decrement/get
	public void increment() {
		value.incrementAndGet();
	}
	
	public void decrement() {
		value.decrementAndGet();
	}
	
	public int getCount() {
		return value.get();
	}
}

class UpdateThread extends Thread {

	private Counter counter;

	public UpdateThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.increment();
	}
}