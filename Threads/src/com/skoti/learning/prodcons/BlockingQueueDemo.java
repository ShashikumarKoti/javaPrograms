package com.skoti.learning.prodcons;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	//	BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		Thread t1 = new Thread(new Producer(queue));
		Thread t2 = new Thread(new Consumer(queue));
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable {

	BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				sharedQueue.put(i);
				System.out.println(Thread.currentThread().getName() + " added " + i);
				Thread.sleep(300); //this Thread.sleep() makes sure prod and cons run one after the other
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Consumer implements Runnable {

	BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
	//	while(true) {
		for(int i=0;i<=10;i++) {
			try {
				Integer take = sharedQueue.take();
				System.out.println(Thread.currentThread().getName() + " consumed "+ take);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}