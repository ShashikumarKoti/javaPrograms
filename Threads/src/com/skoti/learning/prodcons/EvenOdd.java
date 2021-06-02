package com.skoti.learning.prodcons;

public class EvenOdd {

	static final int MAX_COUNT = 20;
	static boolean isOdd = false;
	static int count = 0;

	void printEven() throws InterruptedException {
		synchronized (this) {
			while (count < MAX_COUNT) {
				if (isOdd) {
					wait();
				}
				System.out.println(Thread.currentThread().getName() + " is printing even num "+ count);
				count++;
				isOdd = true;
				notify();
			}
		}
	}
	
	void printOdd() throws InterruptedException {
		synchronized (this) {
			while (count < MAX_COUNT) {
				if (!isOdd) {
					wait();
				}
				System.out.println(Thread.currentThread().getName() + " is printing odd num "+ count);
				count++;
				isOdd = false;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					eo.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					eo.printOdd();;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.setName("Even thread");
		t2.setName("Odd thread");
		t1.start();
		t2.start();
	}
}
